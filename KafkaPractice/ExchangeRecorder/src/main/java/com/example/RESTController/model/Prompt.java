package com.example.RESTController.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;


@Entity
@AllArgsConstructor
public class Prompt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String model;
    String prompt;
    //the following are optional and might not be used
    boolean stream;

    public Prompt() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public boolean isStream() {
        return stream;
    }

    public void setStream(boolean stream) {
        this.stream = stream;
    }

    @Override
    public String toString() {
        return "Prompt{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", prompt='" + prompt + '\'' +
                ", stream=" + stream +
                '}';
    }
}