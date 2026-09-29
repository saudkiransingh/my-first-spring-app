package com.example;


import org.springframework.stereotype.Service;

@Service

public class revolut implements paymentservices {

    @Override
    public void service( ){
        System.out.println("💳 Revolut service called");
    }
}
