package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@RequiredArgsConstructor
@EnableWebSocket
public class ChatWebSocketConfig implements WebSocketConfigurer {

    private final ChatHandler chatHandler;
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        // 클라이언트가 ws/chat 경로로 연결을 시도할 때 chatHandler가 처리하도록 설정
        registry.addHandler(chatHandler, "ws/chat").setAllowedOrigins("*");
    }
}
