package com.naidu.springCore.refTypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/naidu/springCore/refTypes/refTypeconfig.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);

	}

}
