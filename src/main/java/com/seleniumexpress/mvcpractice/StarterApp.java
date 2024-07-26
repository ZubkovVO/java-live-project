package com.seleniumexpress.mvcpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
public class StarterApp {

	public static void main(String[] args) {

		SpringApplication springApplication = new SpringApplication(StarterApp.class);
		springApplication.run(args);
	}
	
	@Bean
	InternalResourceViewResolver viewResolver() {
		
		return new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");
	}
}
