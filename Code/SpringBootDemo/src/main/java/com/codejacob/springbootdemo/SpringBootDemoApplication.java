package com.codejacob.springbootdemo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDemoApplication implements ApplicationRunner, CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
	
	@GetMapping("/")
	public String hello() {
		return "<h1>Hello, Spring Boot!</h1>";
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Command Line Runner : " + args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Application Runner : " + args);
	}

}
