package com.example.RESTController.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LLMExchange {

    Prompt prompt;
    LLMResponse response;
}
