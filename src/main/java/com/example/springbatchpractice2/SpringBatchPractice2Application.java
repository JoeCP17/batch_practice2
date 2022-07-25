package com.example.springbatchpractice2;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class SpringBatchPractice2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBatchPractice2Application.class, args);
    }

}
