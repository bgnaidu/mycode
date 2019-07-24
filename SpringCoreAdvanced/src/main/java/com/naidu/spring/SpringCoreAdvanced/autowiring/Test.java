package com.naidu.spring.SpringCoreAdvanced.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("com/naidu/spring/SpringCoreAdvanced/autowiring/config.xml");
Employee bean = (Employee) context.getBean("employee");
System.out.println(bean);
	}

}
