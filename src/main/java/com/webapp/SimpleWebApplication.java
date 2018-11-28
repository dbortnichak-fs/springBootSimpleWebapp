package com.webapp;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SimpleWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimpleWebApplication.class, args);
    }

    @Bean
    public CommandLineRunner startApplication(ApplicationContext ctx) {
        return args -> {

            System.out.println("Spring context is starting up");

        };
    }
}
