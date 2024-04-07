package com.gfg.firstSpring69.controller;

import com.gfg.firstSpring69.service.GreetService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class FirstController {

    @Autowired
    GreetService greetService;

    public String sayHello(String name) {

      return greetService.sayHello(name);

    }
}


/**
 *
 1. Someone will call our application.
 2. Controller will be the one to receive the call.
 3. Controller will call service layer based on the input.
 4. Service will act on the data, which includes CRUD operations. -> Create, Read, Update and Delete on Entity / domain
 5. Service will return the data to Controller.
 6. Controller will return the data to the user.
 * */