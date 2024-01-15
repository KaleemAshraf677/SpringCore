
//   In this exercise we can inject Reference data types(class Object) 

package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/reference/ReferenceConfiguration.xml");
          Add add=(Add) context.getBean("b1");
          System.out.println(add);
	}

}
