package com.example.RESTController.service;

import com.example.RESTController.model.LLMResponse;
import com.example.RESTController.model.Prompt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ModelService {

    @Autowired
    WebClient webClient;

    @Autowired
    private ProducerService kafkaSender;

    public Mono<LLMResponse> postPrompt(Prompt prompt){
        Mono<LLMResponse> response = webClient.post()
                .uri("/generate")
                .bodyValue(prompt)
                .retrieve()
                .bodyToMono(LLMResponse.class);

        //pass prompt and response to Kafka producer
        kafkaSender.produceToKafka(prompt, response.block());
        return response;
    }



}
