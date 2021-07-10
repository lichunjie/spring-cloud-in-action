package com.lichunjie.boot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${self.message.data}")
    private String message;

    @RequestMapping("hello")
    public String hello() {
        return "Hello World!" + message;
    }
}
