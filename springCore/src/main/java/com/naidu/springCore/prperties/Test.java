package com.naidu.springCore.prperties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/naidu/springCore/prperties/propertyconfig.xml");
		Country country = (Country) context.getBean("country");
		System.out.println(country);

	}

}
