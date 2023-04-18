package com.myproject;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.myproject.ShoppingCart.checkout(..))")
    public void logger(JoinPoint jp){
        System.out.println(jp.getSignature()); //To get the signature of the method. Eg: void com.myproject.ShoppingCart.checkout(String)
        String args = jp.getArgs()[0].toString();
        System.out.println("Arguments: "+args);
        System.out.println("Before loggers");
    }

    @After("execution(* *.*.*.checkout(..))")
    public void afterLogger(){
        System.out.println("After Logger");
    }

    //Below code is an example for @AfterReturning() Aspect.
    @Pointcut("execution(* com.myproject.ShoppingCart.quantity(..))")
    public void afterReturningPointCut(){
    }

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
    public void afterReturning(String retVal){
        System.out.println("After Returning: "+retVal);
    }
}