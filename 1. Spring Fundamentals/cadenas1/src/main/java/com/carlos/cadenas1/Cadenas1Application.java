package com.carlos.cadenas1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class Cadenas1Application {

	public static void main(String[] args) {
		SpringApplication.run(Cadenas1Application.class, args);
	}
		
		@RequestMapping("/")
        public String hello() { // 3

                return "Hello client! How are you doing?";

	}
		
		@RequestMapping("/random")

        public String world() {

                return "Spring Boot is great! So easy to just respond with strings";

        }

}
