package com.example.led;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
@EnableAutoConfiguration
public class LedApplication {
	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}
	public static void main(String[] args) throws Exception {
		SpringApplication.run(LedApplication.class, args);
	}
}

