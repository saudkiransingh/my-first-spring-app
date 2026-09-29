package com.example;
import org.springframework.context.ApplicationContext;
import  org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
       List<paymentservices> paymentservice = new ArrayList<> (context.getBeansOfType(paymentservices.class).values());
       for (paymentservices ser:paymentservice){
           ser.service();
       }

    }

}
