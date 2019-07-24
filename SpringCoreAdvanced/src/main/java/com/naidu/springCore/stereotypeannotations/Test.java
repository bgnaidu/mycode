package com.naidu.springCore.stereotypeannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/naidu/springCore/stereotypeannotations/config.xml");
		Instructor Bean = (Instructor) context.getBean("instructor");
		System.out.println(Bean);
		
		Instructor Bean1 = (Instructor) context.getBean("instructor");
		System.out.println(Bean1);
	}
//C:/Oxygen-eclipse/Workspace/SpringCoreAdvanced/config.xml
	//com/naidu/springCore/stereotypeannotations/
}
