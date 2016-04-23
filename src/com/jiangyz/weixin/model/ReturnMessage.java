package com.jiangyz.weixin.model;

import java.util.List;



public class ReturnMessage {
	private String ToUserName;
	private String FromUserName;
	private String MsgType;
	private String Content;
	private Meidia Image;
	private Meidia Voice;
	private Meidia Video;
	private Meidia Music;
	private int ArticleCount;
	private long CreateTime;
	private List<NewItem> Articles;
	
	
	
	
	public String getToUserName() {
		return ToUserName;
	}




	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}




	public String getFromUserName() {
		return FromUserName;
	}




	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}




	public String getMsgType() {
		return MsgType;
	}




	public void setMsgType(String msgType) {
		MsgType = msgType;
	}




	public String getContent() {
		return Content;
	}




	public void setContent(String content) {
		Content = content;
	}




	public Meidia getImage() {
		return Image;
	}




	public void setImage(Meidia image) {
		Image = image;
	}




	public Meidia getVoice() {
		return Voice;
	}




	public void setVoice(Meidia voice) {
		Voice = voice;
	}




	public Meidia getVideo() {
		return Video;
	}




	public void setVideo(Meidia video) {
		Video = video;
	}




	public Meidia getMusic() {
		return Music;
	}




	public void setMusic(Meidia music) {
		Music = music;
	}




	public int getArticleCount() {
		return ArticleCount;
	}




	public void setArticleCount(int articleCount) {
		ArticleCount = articleCount;
	}
	public void setCreateTime(long createTime)
	{
		CreateTime=createTime;
	}

	public long getCreateTime(){
		return CreateTime;
	}


	public List<NewItem> getArticles() {
		return Articles;
	}




	public void setArticles(List<NewItem> articles) {
		Articles = articles;
	}


	class Meidia{
		private String MediaId;
		private String Title;
		private String Description;
		private String MusicUrl;
		private String HQMusicUrl;
		private String ThumbMediaId;
		public String getMediaId() {
			return MediaId;
		}

		public void setMediaId(String mediaId) {
			MediaId = mediaId;
		}

		public String getTitle() {
			return Title;
		}

		public void setTitle(String title) {
			Title = title;
		}

		public String getDescription() {
			return Description;
		}

		public void setDescription(String description) {
			Description = description;
		}

		public String getMusicUrl() {
			return MusicUrl;
		}

		public void setMusicUrl(String musicUrl) {
			MusicUrl = musicUrl;
		}

		public String getHQMusicUrl() {
			return HQMusicUrl;
		}

		public void setHQMusicUrl(String hQMusicUrl) {
			HQMusicUrl = hQMusicUrl;
		}

		public String getThumbMediaId() {
			return ThumbMediaId;
		}

		public void setThumbMediaId(String thumbMediaId) {
			ThumbMediaId = thumbMediaId;
		}
		
		
		
	}
   public static class NewItem{
    	private String Title;
    	private String Description;
    	private String PicUrl;
    	private String Url;
		public String getTitle() {
			return Title;
		}
		public void setTitle(String title) {
			Title = title;
		}
		public String getDescription() {
			return Description;
		}
		public void setDescription(String description) {
			Description = description;
		}
		public String getPicUrl() {
			return PicUrl;
		}
		public void setPicUrl(String picUrl) {
			PicUrl = picUrl;
		}
		public String getUrl() {
			return Url;
		}
		public void setUrl(String url) {
			Url = url;
		}
		
		
    	
    }
	
	

}
