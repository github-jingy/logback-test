package com.jin.logbacktest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LogbackTestApplication {

    public static void main (String[] args) {
        SpringApplication.run(LogbackTestApplication.class, args);
    }

}
