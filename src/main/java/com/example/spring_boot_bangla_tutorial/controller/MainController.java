package com.example.spring_boot_bangla_tutorial.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.spring_boot_bangla_tutorial.controller.*;
import org.springframework.web.servlet.ModelAndView;

import javax.swing.text.View;

@RestController
public class MainController {

    @GetMapping("/homepage")
    public ModelAndView homepage(){
        ModelAndView mv = new ModelAndView("ProgrammerInfo.html");
        mv.addObject("name", "raj");
        return mv;
    }
}
