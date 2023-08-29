package com.kaat.xploringjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class XploringjpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(XploringjpaApplication.class, args);
    }

}
//Lombok and JPA, they can have issues.
//we do not want to use @Data for JPA it causes problems.