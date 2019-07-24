package com.naidu.springCore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/naidu/springCore/map/mapconfig.xml");
		Product prdct = (Product) context.getBean("product");
		System.out.println(prdct);

	}

}
