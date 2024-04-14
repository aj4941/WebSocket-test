package com.example.demo;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class ChatController {

    @RequestMapping("/chat")
    public String chatGET(HttpServletRequest request) {
        log.info("@ChatController, chat GET()");
        return "chater";
    }
}
