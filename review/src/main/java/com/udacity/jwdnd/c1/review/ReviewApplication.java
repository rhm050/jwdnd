package com.udacity.jwdnd.c1.review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewApplication.class, args);
	}

//	@Bean
//	public List<ChatMessage> chatMessage(MessageService messageService) {
//		System.out.println("Creating message bean.");
//		return messageService.getChatMessages();
//	}

//	@Bean
//	public String upperCaseMessage(MessageService messageService) {
//		System.out.println("Creating upperCaseMessage bean.");
//		return messageService.uppercase();
//	}
//
//	@Bean
//	public String lowerCaseMessage(MessageService messageService) {
//		System.out.println("Creating lowerCaseMessage bean.");
//		return messageService.lowercase();
//	}
}

