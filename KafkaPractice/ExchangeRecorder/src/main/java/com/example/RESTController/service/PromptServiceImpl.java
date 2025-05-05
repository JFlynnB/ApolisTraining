package com.example.RESTController.service;

import com.example.RESTController.model.Prompt;
import com.example.RESTController.repository.PromptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PromptServiceImpl implements PromptService{

    @Autowired
    PromptRepository promptRepository;

    @Override
    @Transactional
    public Prompt storePrompt(Prompt prompt) {
        return promptRepository.save(prompt);
    }
}
