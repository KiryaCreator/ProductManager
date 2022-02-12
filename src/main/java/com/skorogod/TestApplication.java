package com.skorogod;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class TestApplication {
    public static void main(String[] args) {
        try{
            SpringApplication.run(TestApplication.class, args);
        } catch (Exception e){
            log.error("Error of Running", e);
        }
    }
}