package com.example.spring_boot_bangla_tutorial.model;

import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Dog {
    public Dog(){
        System.out.println("Dog object created");
    }

    public void info(){
        System.out.println("This is a German sheperd dog");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Dog object destroyed");
    }
}
