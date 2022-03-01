package com.example.demoaop.service;

import com.example.demoaop.aop.annotations.MaTrace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    @Lazy
    private HelloService helloService;

    public String sayHello() {
        return helloService.sayHello2();
    }

    @MaTrace
    public String sayHello2() {
        return "hello";
    }
}
