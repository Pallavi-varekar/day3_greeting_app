package com.example.greetingappdev.controller;

import com.example.greetingappdev.model.Greeting;
import com.example.greetingappdev.service1.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class GreetingController
{
    @Autowired
    GreetingService greetingService;
    @PostMapping(value = "/body")//uc1
    public String greetingMessages(@RequestBody Greeting greeting){
        return greeting.getId()+" "+greeting.getName()+" "+greeting.getMessages();
    }
    @PostMapping(value ="/sayHello" )//uc2
    public String GreetingSayhello(@RequestBody Greeting  greeting){
        return greetingService.sayHello(greeting);
    }
    @PostMapping(value ="/Hello" )//uc4
    public String GreetinghelloTo(@RequestBody Greeting  greeting){
        return greetingService.sayHello(greeting);
    }
    @PostMapping(value = "/body")
    public Greeting greetingMessagessave(@RequestBody Greeting greeting){
        return greetingService.printMessages(greeting);
    }
    @GetMapping("/getMessage/{id}")//uc5
    public Optional<Greeting> findGreeting(@PathVariable int id){
        return greetingService.findGreeting(id);
    }
    @GetMapping(value = "/allGreeting")
    public List<Greeting> allGreeting(){
        return greetingService.allGreeting();
    }

}