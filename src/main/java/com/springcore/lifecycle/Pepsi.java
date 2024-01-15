package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean {
	private int price;
	private String size;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		System.out.println("Setting Pepsi");
		this.price = price;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		System.out.println("setting size");
		this.size = size;
	}
	
	
	public void afterPropertiesSet() throws Exception {
	         System.out.println("Inside init method: drinking Pepsi");	
	}
	public void destroy() throws Exception {
		System.out.println("Inside destroy method: Throwing Pepsi bottle in garbage");	
	}
	
	@Override
	public String toString() {
		return "Pepsi [price=" + price + ", size=" + size + "]";
	}
	
	

}
