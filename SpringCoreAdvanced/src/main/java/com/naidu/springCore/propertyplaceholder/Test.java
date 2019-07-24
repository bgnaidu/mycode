package com.naidu.springCore.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/naidu/springCore/propertyplaceholder/config.xml");
		MyDAO Bean = (MyDAO) context.getBean("myDAO");
		System.out.println(Bean);
	}

}
