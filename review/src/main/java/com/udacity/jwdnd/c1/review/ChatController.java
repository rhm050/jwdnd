package com.udacity.jwdnd.c1.review;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chat")
public class ChatController {
    final private MessageService messageService;

    public ChatController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping
    public String getChatPage(@ModelAttribute("chatForm") ChatForm chatForm, Model model) {
        model.addAttribute("chatMessage", this.messageService.getChatMessages());
        return "chat";
    }

    @PostMapping
    public String addChatMessage(@ModelAttribute("chatForm") ChatForm chatForm, Model model) {
        messageService.addMessage(chatForm);
        chatForm.setMessageText("");
        model.addAttribute("chatMessage", this.messageService.getChatMessages());
        return "chat";
    }
}
