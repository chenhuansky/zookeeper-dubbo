package com.example.controller.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations={"classpath:consumer.xml"})
public class ConsumerStart {
    public static void main(String[] args){
        SpringApplication.run(ConsumerStart.class,args);
    }

}
