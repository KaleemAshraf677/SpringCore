package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	
	private String name;
	private List<String> phones;
	private Set<String> addresses;
	private Map<String,String> courses;
	private Properties id;
	
	
	
	
	public Properties getId() {
		return id;
	}
	public void setId(Properties id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", phones=" + phones + ", addresses=" + addresses + ", courses=" + courses
				+ ", id=" + id + "]";
	}
	
	
	
	
	
	
	

}
