package com.balausa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.balausa"})
@SpringBootApplication
public class PaginationMappingApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaginationMappingApplication.class, args);
    }

}
