package com.example.greetingappdev.repo;

import com.example.greetingappdev.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface greetingRepository extends JpaRepository <Greeting,Integer>{
}
