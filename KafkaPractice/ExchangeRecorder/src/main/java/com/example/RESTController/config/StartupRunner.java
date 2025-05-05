package com.example.RESTController.config;

import com.example.RESTController.model.Prompt;
import com.example.RESTController.repository.PromptRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StartupRunner {

    @Bean
    public CommandLineRunner testDb(PromptRepository promptRepository) {
        return args -> {
            Prompt testPrompt = new Prompt();
            testPrompt.setModel("gpt-test");
            testPrompt.setPrompt("What is 2 + 2?");
            testPrompt.setStream(false);

            Prompt saved = promptRepository.save(testPrompt);
            System.out.println("✅ Saved prompt with ID: " + saved.getId());
        };
    }
}