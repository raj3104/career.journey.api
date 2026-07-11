package com.raj.career.journey.api.controller;

import com.raj.career.journey.api.model.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String home(){
        return "Hello Raj!\nWelcome to your backend journey.";
    }

    @GetMapping("/about")
    public String about(){
        return "I am Raj.\nLearning Spring Boot Day 3.";
    }

    @GetMapping("/goal")
    public String goal(){
        return "Become a Product Software Engineer.";
    }

    @GetMapping("/profile")
    public Profile getProfile(){
        Profile myProfile=new Profile("Raj", 21, "VIT Bhopal", "Become a software engineer");
        return myProfile;
    }

}
