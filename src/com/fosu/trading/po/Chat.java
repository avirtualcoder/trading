package com.fosu.trading.po;

import org.springframework.stereotype.Component;

@Component
public class Chat extends ChatKey {
    private String chatContent;

    public String getChatContent() {
        return chatContent;
    }

    public void setChatContent(String chatContent) {
        this.chatContent = chatContent == null ? null : chatContent.trim();
    }
}