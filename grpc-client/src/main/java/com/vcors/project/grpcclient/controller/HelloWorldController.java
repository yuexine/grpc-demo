package com.vcors.project.grpcclient.controller;

import com.vcors.project.grpcclient.component.HelloWorldClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    private HelloWorldClient helloWorldClient;

    @GetMapping("/hello")
    public String hello() {
        return helloWorldClient.sayHello("zhang", "san");
    }
}
