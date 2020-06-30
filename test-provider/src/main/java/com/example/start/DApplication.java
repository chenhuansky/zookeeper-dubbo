package com.example.start;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableDubbo
@ComponentScan (basePackages={"com.example.service"})
@ImportResource(value={"classpath:provider.xml"})
public class DApplication {
        public static void main(String[] args) {
            SpringApplication.run(DApplication.class, args);

        }

    }


