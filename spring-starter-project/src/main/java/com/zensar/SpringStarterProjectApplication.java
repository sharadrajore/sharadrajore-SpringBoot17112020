package com.zensar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.zensar.controllers.StudentController;
import com.zensar.entites.Student;

@SpringBootApplication
public class SpringStarterProjectApplication  {
	
	public static void main(String[] args) {
		
		 SpringApplication.run(SpringStarterProjectApplication.class, args);
	}
	
}
