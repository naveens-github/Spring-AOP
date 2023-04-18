package com.myproject;
import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout(String name){

        //Logging
        //Authentication & Authorization
        //Sanitize the data
        System.out.println("checkout method from shopping cart is called");
    }

    public int quantity(){
        return 2;
    }
}
