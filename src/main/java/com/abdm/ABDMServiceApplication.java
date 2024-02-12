package com.abdm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ABDMServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ABDMServiceApplication.class,args);
        System.out.println("----------------- ABDM Service Application Started --------------------");
    }
}