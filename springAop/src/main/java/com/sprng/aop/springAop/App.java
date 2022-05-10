package com.sprng.aop.springAop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      
	@SuppressWarnings("resource")
	ApplicationContext appContext=new ClassPathXmlApplicationContext("Customer.xml");
       CustomerService cust = (CustomerService) appContext.getBean("CustomerServiceProxy");
      
       System.out.println("****************");
       cust.printName();
       System.out.println("*****************");
       cust.printUrl();
       System.out.println("******************");
       try {
    	   cust.printThrowException();
    	  }catch (Exception e) {
			
		}
    }
}
