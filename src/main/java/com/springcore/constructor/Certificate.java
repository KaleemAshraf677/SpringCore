package com.springcore.constructor;

public class Certificate {
	private String course;
	private int duration;
	
	public Certificate(String course, int duration) {
		this.course = course;
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Certificate [course=" + course + ", duration=" + duration + "]";
	}
	
	
	
	

}
