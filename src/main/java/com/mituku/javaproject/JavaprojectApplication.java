package com.mituku.javaproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaprojectApplication {

	@RequestMapping("/message")
	public String welcome()
	{
		return "Hello World!!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(JavaprojectApplication.class, args);
	}

}
