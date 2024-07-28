package com.seleniumexpress.mvcpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StarterApp {

	public static void main(String[] args) {

		SpringApplication springApplication = new SpringApplication(StarterApp.class);
		springApplication.run(args);
	}
	
}
