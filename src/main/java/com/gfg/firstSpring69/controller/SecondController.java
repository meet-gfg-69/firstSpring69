package com.gfg.firstSpring69.controller;

import com.gfg.firstSpring69.service.GreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {

    @Autowired
    GreetService greetService;

    public String sayHi(String name) {

        return greetService.sayHello(name);

    }

}
