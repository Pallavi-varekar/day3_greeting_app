package com.example.greetingappdev.controller;

import com.example.greetingappdev.model.Greeting;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetindController {
    @PostMapping(value = "/body")//uc1
    public String greetingMessages(@RequestBody Greeting greeting){
        return greeting.getId()+" "+greeting.getName()+" "+greeting.getMessages();
    }
}