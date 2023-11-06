package com.example.spring_boot_bangla_tutorial.model;

import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Coder {
    @Autowired
    Dog dog;
    public Coder(){
        System.out.println("coder object creates");
    }
    public void petInfo(){
        dog.info();
    }

    @PreDestroy  // use to destoy the object
    public void destory(){
        System.out.println("coder object destroyed");
    }
}
