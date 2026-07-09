package com.raj.career.journey.api.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String home(){
        return "Hello Raj!\nWelcome to your backend journey.";
    }
}
