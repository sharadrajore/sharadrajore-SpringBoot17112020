package com.zensar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

import com.zensar.controllers.StudentController;
import com.zensar.entites.Student;

@SpringBootApplication
public class SpringStarterProjectApplication extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return super.configure(builder);
	}

	public static void main(String[] args) {
		
		 SpringApplication.run(SpringStarterProjectApplication.class, args);
	}
	
	
	
}
