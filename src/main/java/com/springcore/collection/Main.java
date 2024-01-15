
//  In this exercise we can inject Colection data types: Set,List,Map,Properties

package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collection/collectionconfiguration.xml");
           Employee e1=(Employee) context.getBean("Emp");
           System.out.println(e1);
	}

}
