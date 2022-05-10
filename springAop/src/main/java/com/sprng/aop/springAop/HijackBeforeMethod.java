package com.sprng.aop.springAop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class HijackBeforeMethod implements MethodBeforeAdvice

{

 public void before(Method method, Object[] args, Object target)
		 throws Throwable {
		System.out.println("HijackBeforeMethod : Before Method hijacked");
		
	}
  
}
