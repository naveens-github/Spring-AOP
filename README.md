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

* @PointCut(within())
  * Eg: @Pointcut("within(com.myproject..*)")       
    public void authenticatingPointCut(){      
    }   
    
* JoinPoint jp. We will pass this JoinPoint as argument.   
  * Eg: public void logger(JoinPoint jp){   
        System.out.println(jp.getSignature());   
        }   
        
* @AfterReturning
  * @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
  * Eg:     @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")    
    public void afterReturning(String retVal){    
        System.out.println("After Returning: "+retVal);    
    }    
