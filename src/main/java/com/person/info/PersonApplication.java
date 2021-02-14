package com.person.info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PersonApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(
                PersonApplication.class, args);
    }
}
