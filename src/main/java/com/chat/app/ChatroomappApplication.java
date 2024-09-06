package com.chat.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatroomappApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatroomappApplication.class, args);
	}

}

//to connect with server  /server1
//to sent message         /app/message
//						{}

// to subscribe so that we can receive message        /topic/return-to