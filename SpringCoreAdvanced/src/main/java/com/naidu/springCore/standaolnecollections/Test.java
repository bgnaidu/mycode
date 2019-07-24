package com.naidu.springCore.standaolnecollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/naidu/springCore/standaolnecollections/config.xml");
		ProductList Bean = (ProductList) context.getBean("productlist");
		System.out.println(Bean);
	}

}
