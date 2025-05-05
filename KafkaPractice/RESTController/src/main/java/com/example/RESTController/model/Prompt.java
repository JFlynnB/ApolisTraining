package com.example.RESTController.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Prompt {

    String model;
    String prompt;
    //the following are optional and might not be used
    boolean stream;


    public Prompt(String model, String prompt, boolean stream) {
        this.model = model;
        this.prompt = prompt;
        this.stream = false;
    }
}
