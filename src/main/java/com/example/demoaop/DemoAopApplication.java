package com.example.demoaop;

import com.example.demoaop.aop.annotations.MaTrace;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoAopApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAopApplication.class, args);

	}

}
