package com.example.RESTController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ExchangeRecorderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExchangeRecorderApplication.class, args);
	}

}
