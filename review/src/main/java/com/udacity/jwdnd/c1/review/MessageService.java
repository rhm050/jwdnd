package com.udacity.jwdnd.c1.review;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService {
    private List<ChatMessage> chatMessages;

    @PostConstruct
    public void postConstruct() {
        System.out.println("Creating MessageService bean.");
        this.chatMessages = new ArrayList<>();
    }

    public void addMessage(ChatForm chatForm) {
        ChatMessage newChatMessage = new ChatMessage();
        newChatMessage.setUserName(chatForm.getUserName());
        switch (chatForm.getMessageType()){
            case "Say":
                newChatMessage.setMessageText(chatForm.getMessageText());
                break;
            case "Shout":
                newChatMessage.setMessageText(chatForm.getMessageText().toUpperCase());
                break;
            case "Whisper":
                newChatMessage.setMessageText(chatForm.getMessageText().toLowerCase());
                break;
            default:
                break;
        }
        this.chatMessages.add(newChatMessage);
    }

    public List<ChatMessage> getChatMessages() {
        return new ArrayList<>(this.chatMessages);
    }
//    public String uppercase() {
//        return chatMessage.toUpperCase();
//    }
//
//    public String lowercase() {
//        return chatMessage.toLowerCase();
//    }

}
