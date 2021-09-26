package com.example.parse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class ParseApplication {



	public static void main(String[] args) {
		SpringApplication.run(ParseApplication.class, args);
	}

	@GetMapping("/")
	public String ok() {
		return "Приложение рабоатет";
	}


}



