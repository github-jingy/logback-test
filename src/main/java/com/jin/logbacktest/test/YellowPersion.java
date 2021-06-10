package com.jin.logbacktest.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(0)
class YellowPerson implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("----YellowPersion----");
    }
}