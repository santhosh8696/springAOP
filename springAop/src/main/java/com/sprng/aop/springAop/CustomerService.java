package com.sprng.aop.springAop;
import com.sprng.aop.springAop.CustomerService;

public class CustomerService
{
  private String name;
  private String url;
  public void setName(String name) {
		this.name = name;
	}
  public void setUrl(String url) {
		this.url = url;
	}

public void printName() {
	System.out.println("customer name: " +this.name);
}

public void printUrl() {
	System.out.println("customer website: " +this.url);
}
public void printThrowException() {
	throw new IllegalArgumentException();
}
  
  
}
