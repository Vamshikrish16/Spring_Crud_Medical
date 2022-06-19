package com.example.crud.entity;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

        private final String p = "vamshii";

        @Bean(name="p")
        public String getP(){return p;}
    }
