package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/standalone/collection/config.xml");
          Person p1= context.getBean("per",Person.class);    // no need to typecast
	       System.out.println(p1);
	       
	           
	}

}
