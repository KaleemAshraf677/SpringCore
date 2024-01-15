package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Jalebi {
	private int price;
	private String quantity;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		System.out.println("Setting Price");
		this.price = price;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		System.out.println("Setting Quantity");
		this.quantity = quantity;
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Inside init method: Eating Jalebi ");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Inside destroy method: Jalebi is over");
	}
	
	@Override
	public String toString() {
		return "Jalebi [price=" + price + ", quantity=" + quantity + "]";
	}
	
	
	
	

}
