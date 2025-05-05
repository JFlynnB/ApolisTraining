package com.example.RESTController.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Response {

    String model;
    String created_at;
    String response;
    boolean done;
    String done_reason;
    int[] context;
    long total_duration;
    long load_duration;
    int prompt_eval_count;
    long prompt_eval_duration;
    int eval_count;
    long eval_duration;
}