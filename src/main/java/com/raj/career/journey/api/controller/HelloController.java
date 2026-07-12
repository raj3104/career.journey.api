package com.raj.career.journey.api.controller;

import com.raj.career.journey.api.model.Profile;
import com.raj.career.journey.api.model.Laptop;
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

    @GetMapping("/laptop")
    public Laptop getLaptop(){
        Laptop myLaptop=new Laptop("Acer", "intel i5 11th gen", 32,65000.00);

        return myLaptop;
    }

}
