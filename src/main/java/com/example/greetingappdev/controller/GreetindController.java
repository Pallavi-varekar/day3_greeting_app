package com.example.greetingappdev.controller;

import com.example.greetingappdev.model.Greeting;
import com.example.greetingappdev.service1.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GreetindController
{
    //@Autowired
    GreetingService greetingService;
    @PostMapping(value = "/body")//uc1
    public String greetingMessages(@RequestBody Greeting greeting){
        return greeting.getId()+" "+greeting.getName()+" "+greeting.getMessages();
    }
    @PostMapping(value ="/sayHello" )//uc2
    public String GreetingSayhello(@RequestBody Greeting  greeting){
        return greetingService.sayHello(greeting);
    }
    @PostMapping(value ="/Hello" )//uc2
    public String GreetinghelloTo(@RequestBody Greeting  greeting){
        return greetingService.sayHello(greeting);
    }


}