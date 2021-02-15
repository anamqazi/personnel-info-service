package com.person.info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


//@EnableSwagger2
@SpringBootApplication
public class PersonApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(
                PersonApplication.class, args);
    }
   /* @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.person")).build();
    }*/
}
