package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.example")
@EntityScan("com.example.entities")
@EnableJpaRepositories("com.example.entities")
public class RestDataTestApplication {
	
	@Bean
	public StartUpRunner startUpRunner() {
		return new StartUpRunner();
	}

	public static void main(String[] args) {
		SpringApplication.run(RestDataTestApplication.class, args);
	}//Close main
	
/*
@ComponentScan("com.example")
@EntityScan("com.example.entities")
@EnableJpaRepositories("com.example.entities")
*/
}//Close RestDataTestApplication class.
