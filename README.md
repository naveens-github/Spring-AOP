# Spring-AOP
#### Point-cuts:
* @Before. We have to mention at the top of methods.
  * Eg: @Before("execution(* com.myproject.ShoppingCart.checkout())")      
    public void logger(){     
        System.out.println("loggers");       
    }    

* @After. We have to mention at the top of methods.
  * Eg: @After("execution(* com.myproject.ShoppingCart.checkout())")      
    public void logger(){     
        System.out.println("loggers");       
    } 
