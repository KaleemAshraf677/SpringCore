package com.springcore.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {  //bean class (we can use autowiring concept because here Emp class only contains Reference object
	
	private Address add;  // In this Address(non primitive data Type)   , add(name of property or attribute)
    
	
	public Emp(Address add) {
		System.out.println("Inside Emp constructor");
		this.add = add;
	}

	public Emp() {
	}

	public Address getAdd() {
		return add;
	}
    
	@Autowired       //we can use this @Autowired annotation on 1.Reference(object) property.as well as on 2.constructor and also on 3. setter method
	@Qualifier("add5")  // @Qualifier is add-on annotation used to described which bean you are executing. 
	public void setAdd(Address add) {
		System.out.println("Inside Setter method");
		this.add = add;
	}

	@Override
	public String toString() {
		return "Emp [add=" + add + "]";
	}
	
	
	
	
	

}
