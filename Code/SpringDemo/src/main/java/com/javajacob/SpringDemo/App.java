package com.javajacob.SpringDemo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import org.springframework

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
        
        context.registerShutdownHook();
        
        ParentHelloWorld parentHW = (ParentHelloWorld)context.getBean("parentHelloWorld");
        parentHW.getMessage1();
        parentHW.getMessage2();
        
        ChildHelloWorld childHW = (ChildHelloWorld)context.getBean("childHelloWorld");
        childHW.getMessage1();
        childHW.getMessage2();
        childHW.getMessage3();
        
        context.close();
    }
}
