package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class paypal implements paymentservices {

        @Override
        public void service( ){
            System.out.println("💰 PayPal service called");
    }
}
