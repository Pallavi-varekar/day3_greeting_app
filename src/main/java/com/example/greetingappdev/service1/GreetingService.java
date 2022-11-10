package com.example.greetingappdev.service1;

import com.example.greetingappdev.model.Greeting;
import com.example.greetingappdev.repo.greetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class GreetingService {
    public String sayHello(Greeting greeting){
        //return greeting.getId()+greeting.getName()+greeting.getMessages();//uc2
        return greeting.toString();//uc3


    }
     @Autowired
    greetingRepository GreeetingRepository;
    public Greeting printMessages(Greeting greeting){

        return greetingRepository.save(new Greeting(greeting.getId(),greeting.getName(),greeting.getMessages()));
      //  return greetingRepository.save(greeting);

    }
    public Optional<Greeting> findGreeting(int id) {
        return greetingRepository.findById(id);
    }
}
