
// In this exercise we can inject primitive data types: byte,short,char,int,long,float,double,boolean.  

package com.edu.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMethod {

	public static void main(String[] args) {
         ApplicationContext context=new ClassPathXmlApplicationContext("com/edu/springcore/config.xml");
         
         Student s1=(Student) context.getBean("stu");
         Student s2=(Student) context.getBean("stu1");
         Student s3=(Student) context.getBean("stu2");
         
         System.out.println(s1);
         System.out.println(s2);
         System.out.println(s3);

	}

} 
