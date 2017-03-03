package com.raja;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

import com.raja.config.JpaConfig;
import com.raja.model.Test;

import com.raja.repository.TestRepository;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAutoConfiguration
@Import(JpaConfig.class)
public class Application {
	
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	
	}
}
