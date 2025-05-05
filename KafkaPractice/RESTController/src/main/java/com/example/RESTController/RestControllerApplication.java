package com.example.RESTController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class RestControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestControllerApplication.class, args);
	}

	@Bean(name="webClient")
	public WebClient webClient() {
		return WebClient.builder()
				.baseUrl("http://localhost:11434/api")
				.build();
	}

}
