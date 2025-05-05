package com.example.RESTController.service;

import com.example.RESTController.model.Prompt;
import org.springframework.stereotype.Service;

@Service
public interface PromptService {

    Prompt storePrompt(Prompt prompt);
}
