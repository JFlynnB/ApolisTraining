package com.example.RESTController.service;

import com.example.RESTController.model.LLMExchange;
import com.example.RESTController.model.LLMResponse;
import com.example.RESTController.model.Prompt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    private String kafkaTopic = "llm-exchanges";

    @Autowired
    private KafkaTemplate kafkaTemplate;


    public void produceToKafka(Prompt prompt, LLMResponse response){
        //LLMExchange exchange = new LLMExchange(prompt, response);
        //sends to TOPIC, with KEY, the MESSAGE
        //kafkaTemplate.send(kafkaTopic, response.getCreated_at(), exchange);
        kafkaTemplate.send("prompt-topic", prompt);
        //kafkaTemplate.send("response-topic", response);
        System.out.println("Message sent to topic " + kafkaTopic + ". Prompt was: " + prompt.getPrompt());
    }
}
