package com.gfg.firstSpring69.service.impl;

import com.gfg.firstSpring69.service.GreetService;
import org.springframework.stereotype.Service;

@Service
public class GreetHelloServiceImpl implements GreetService {

    GreetHelloServiceImpl(){
        System.out.println("I am getting created.");
    }
    @Override
    public String sayHello(String name) {
        return  "Hello " + name;
    }
}
