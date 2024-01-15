package com.springcore.lifecycle;

public class Samosa {    // bean class first make object than setting the value of property
	private int price;
	private String size;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		System.out.println("Setting price");
		this.price = price;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		System.out.println("Setting size");
		this.size = size;
	}
	
	public void hey() {
		System.out.println("Inside init method: hey how are you ?");
	}
	
	public void bye() {
		System.out.println("Inside destroy method: bye bye i am going to die");
	}
	
	
	@Override
	public String toString() {
		return "Samosa [price=" + price + ", size=" + size + "]";
	}
	
	
	
	
	
	

}
