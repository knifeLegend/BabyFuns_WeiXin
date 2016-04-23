package com.jiangyz.weixin.model;

public enum MessageType {
	    Text("text"),  
	    Image("image"),  
	    Music("music"),  
	    Video("video"),  
	    Voice("voice"),  
	    Location("location"),  
	    Link("link");  
	    private String msgType = "";  
	  
	    MessageType(String msgType) {  
	        this.msgType = msgType;  
	    }  
	  
	    /** 
	     * @return the msgType 
	     */  
	    @Override  
	    public String toString() {  
	        return msgType;  
	    }  
	 
}
