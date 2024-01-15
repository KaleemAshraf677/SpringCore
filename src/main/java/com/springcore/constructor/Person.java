package com.springcore.constructor;

import java.util.List;

public class Person {
	
	private String name;
	private int id;
	private String address;
	private Certificate certi;
	private List<String> education;
	
public Person(String name, int id, String address, Certificate certi, List<String> education) {
		this.name = name;
		this.id = id;
		this.address = address;
		this.certi = certi;
		this.education= education;
	}

@Override
public String toString() {
	return "Person [name=" + name + ", id=" + id + ", address=" + address + ", certi=" + certi + ", education="
			+ education + "]";
}

	
	
	
	
	
	

}
