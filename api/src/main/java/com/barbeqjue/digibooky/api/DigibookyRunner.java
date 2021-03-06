package com.barbeqjue.digibooky.api;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages = {"com.barbeqjue.digibooky.domain","com.barbeqjue.digibooky.services","com.barbeqjue.digibooky.api"})
public class DigibookyRunner {
    public static void main(String[] args) {
        SpringApplication.run(DigibookyRunner.class, args);
    }
}
