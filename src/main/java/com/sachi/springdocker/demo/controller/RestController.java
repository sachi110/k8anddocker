package com.sachi.springdocker.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {



    @GetMapping("/")
    public  String getWelcomeNote() {
        return "welcome note for docker";
    }

}
