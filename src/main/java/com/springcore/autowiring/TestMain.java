/*  Feature of Spring Framework in which spring container inject dependencies automatically.  
 *  Autowiring cant be used to inject primitive and string values.It works with reference(objects only).So, we used autowiring only for reference class. 
  
 * Autowiring Modes: There are 2 types of autowiring mode:
 * 
                    1. XML file Mode: In XML autowiring is 3 types:
                                      1. byName
                                      2. bytype
                                      3. constructor
                    2. Annotation Mode:
                              @Autowired   */

package com.springcore.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		
ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autowiring/autowiringConfig.xml");
                  Emp e1=context.getBean("em",Emp.class);	// we dont need to typecaste if we write   getBean("bean_name",ClassName.class)  
                  System.out.println(e1);
	}

}
