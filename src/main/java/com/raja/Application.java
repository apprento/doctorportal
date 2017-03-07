package com.raja;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.raja.config.JpaConfig;

@SpringBootApplication
@EnableAutoConfiguration
@Import(JpaConfig.class)
public class Application {
	
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	
	}
}
