package com.example.examplewordpres;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class ExampleWordpresApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleWordpresApplication.class, args);
    }

}
