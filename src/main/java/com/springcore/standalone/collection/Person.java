package com.springcore.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	
	private List<String> friends;
	private Map<String,Integer> feestructure; 
	private Properties connection;

	
	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	
	public Map<String, Integer> getFeestructure() {
		return feestructure;
	}

	public void setFeestructure(Map<String, Integer> feestructure) {
		this.feestructure = feestructure;
	}
	

	public Properties getConnection() {
		return connection;
	}

	public void setConnection(Properties connection) {
		this.connection = connection;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feestructure=" + feestructure + ", connection=" + connection + "]";
	}

	

	
	

	
}
