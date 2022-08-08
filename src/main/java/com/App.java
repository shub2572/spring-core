package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.EmployeeBean;
import com.bean.UserBean;

/**
 * Hello world!
 *
 */
public class App  
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	UserBean user = (UserBean)context.getBean("user");
  	
    	
    	System.out.print(user.getFirstName());
    	System.out.println(" "+user.getLastName());

    	EmployeeBean emp = (EmployeeBean)context.getBean("emp");
    	
    	desz
    	System.out.println(emp.getName());
    	context.registerShutdownHook();
    }
}
