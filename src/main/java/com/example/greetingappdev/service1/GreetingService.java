package com.example.greetingappdev.service1;

import com.example.greetingappdev.model.Greeting;

public class GreetingService {
    public String sayHello(Greeting greeting){
        //return greeting.getId()+greeting.getName()+greeting.getMessages();//uc2
        return greeting.toString();//uc3

    }
}
