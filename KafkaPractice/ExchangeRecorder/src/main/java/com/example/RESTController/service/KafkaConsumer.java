package com.example.RESTController.service;

import com.example.RESTController.model.Prompt;
import com.example.RESTController.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {


    @Autowired
    PromptService promptService;

    @KafkaListener( id="one", topics="prompt-topic", groupId = "group_one", containerFactory = "kafkaListenerContainerFactory")
    public void consumerOne(@Payload Prompt prompt) throws Exception {
        //prompt.setID();
        //prompt.setId(1L);
        System.out.println("Consumed a new prompt: " + prompt.toString());
        promptService.storePrompt(prompt);
        System.out.println("Consumed exchange with prompt: " + prompt.getModel());
    }

    /*@KafkaListener( id="two", topics="llm-exchanges", groupId = "group_one", containerFactory = "kafkaListenerContainerFactory")
    public void consumerTwo(@Payload Response response) throws Exception {
        exchangeService.storeExchange(response);
        System.out.println("Consumed exchange with prompt: " + response.getPrompt().getPrompt().substring(0, 100));
    }*/
}
