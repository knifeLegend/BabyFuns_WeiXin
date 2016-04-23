package com.jiangyz.weixin.service;

import java.util.Date;

import com.jiangyz.weixin.model.MessageModel;
import com.jiangyz.weixin.model.ReturnMessage;

public class MessageDealService {
	
	
	public static ReturnMessage  DealMessage(MessageModel receiveMsg){
			ReturnMessage returnMessage = new ReturnMessage();
			returnMessage.setFromUserName(receiveMsg.getToUserName());
			returnMessage.setToUserName(receiveMsg.getFromUserName());
			returnMessage.setCreateTime(new Date().getTime());
			return returnMessage;
	}

}
