package com.example.demoaop.testannotation;

import com.example.demoaop.aop.annotations.MaTrace;
import com.example.demoaop.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {
    @Autowired
    HelloService helloService;

    @GetMapping
    public String getHello() {
        return helloService.sayHello();
    }


}
