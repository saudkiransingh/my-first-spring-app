package com.example;
import org.springframework.context.annotation.Bean;
import  org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig {

    @Bean
    public College college(){
        return new College();
    }
    public  String New_met(){
        return New_met();
    }
}



