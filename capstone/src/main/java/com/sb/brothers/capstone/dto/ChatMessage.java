package com.sb.brothers.capstone.dto;

import java.util.Date;

public class ChatMessage {
    
    private MessageType type;
    private Date createDate;
    private String content;
    private String sender;
    private String receiver;
    
    public enum MessageType {
        CHAT, JOIN, LEAVE
    }
    
    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
