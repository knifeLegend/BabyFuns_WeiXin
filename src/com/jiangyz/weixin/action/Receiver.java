package com.jiangyz.weixin.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jiangyz.weixin.model.MessageModel;
import com.jiangyz.weixin.model.MessageType;
import com.jiangyz.weixin.model.ReturnMessage;
import com.jiangyz.weixin.service.MessageDealService;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

@Controller
@RequestMapping(value = "/gl")
public class Receiver {
	public String teString;
	@RequestMapping(value = "/add")
	public @ResponseBody
	String add(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ServletInputStream in = request.getInputStream();
		StringBuilder xmlMsg = new StringBuilder();
		byte[] b = new byte[4096];
		for (int n; (n = in.read(b)) != -1;) {
			xmlMsg.append(new String(b, 0, n, "UTF-8"));
		}
		XStream xs = new XStream(new DomDriver());
		xs.alias("xml", MessageModel.class);
		MessageModel receiveMsg = (MessageModel) xs.fromXML(xmlMsg.toString());
		ReturnMessage returnMessage=MessageDealService.DealMessage(receiveMsg);
		xs.alias("xml", ReturnMessage.class);
		xs.alias("item", ReturnMessage.NewItem.class);
		//xs.useAttributeFor(ReturnMessage.class,"Content");
		String retString = xs.toXML(returnMessage);

		System.out.println(retString);
		return retString;
	}

	public void setTeString(String teString) {
		this.teString = teString;
	}

}
