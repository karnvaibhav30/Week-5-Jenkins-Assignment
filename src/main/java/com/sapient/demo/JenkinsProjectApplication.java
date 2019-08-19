package com.sapient.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsProjectApplication {

	public static void main(String[] args) {
		
		
		SpringApplication.run(JenkinsProjectApplication.class, args);
		System.out.println("Hello its just a random try");
		Sum s1= new Sum();
        System.out.println("The result is"+s1.add(5, 10));	
	}

}
