package com.example.RESTController.repository;

import com.example.RESTController.model.Prompt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromptRepository extends JpaRepository<Prompt, Long> {


}
