
/* 1.Implementing spring bean LifeCycle  using XMl.(init(),destroy() --> These method declares in configuration.xml file
   2.Implementing Spring bean LifeCycle using Interfaces.(InitializingBean,DisposableBean)  
   3.Implementing Spring bean LifeCycle using Annotations.( @PostConstruct for init method, @PreDestroy for destroy method)
        
Note --> 1. both the @PostConstruct and @PreDestroy annotations deprecated after Java 8,we need to add an additional dependency in pom.xml file to use these annotations:

             <dependency>
                         <groupId>javax.annotation</groupId>
                         <artifactId>javax.annotation-api</artifactId>
                         <version>1.3.2</version>
             </dependency>  
            
2.After adding this dependency, use tag <context:annotation-config/> to enable all the annotations in our project. */

package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
        //using XML
        Samosa s1=(Samosa) context.getBean("sam");
        System.out.println(s1);
        
        //using Interfaces
            Pepsi p1 =(Pepsi) context.getBean("pep");
            System.out.println(p1);
            
       // using Annotation
            Jalebi j1=(Jalebi) context.getBean("jal");
            System.out.println(j1);
        
        //  destroy() -->  registerShutdownHook()
        context.registerShutdownHook();
	}

}
