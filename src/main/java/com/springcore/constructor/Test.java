
// In this exercise we can learn injection of Constructors 

package com.springcore.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collection.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/constructor/constructorconfiguration.xml");
        Person p1=(Person) context.getBean("human");
        System.out.println(p1);
        
        // constructor ambiguity concept
        Addition add =(Addition) context.getBean("ambiguity");
        System.out.println(add);
        

	}

}
