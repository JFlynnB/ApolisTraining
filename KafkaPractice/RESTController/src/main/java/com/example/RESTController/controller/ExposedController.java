package com.example.RESTController.controller;


import com.example.RESTController.model.LLMResponse;
import com.example.RESTController.model.Prompt;
import com.example.RESTController.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/llm")
public class ExposedController {

    @Autowired
    private ModelService modelService;

    @PostMapping("/prompt")
    public Mono<LLMResponse> postPrompt(@RequestBody Prompt prompt){
        return modelService.postPrompt(prompt);
    }
}
