package com.naidu.springCore.list;

import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HospitalTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/naidu/springCore/list/listconfig.xml");
		Hospital hospital = (Hospital) applicationContext.getBean("hospital");
		
		System.out.println("hospital name is:"+hospital.getName());

		System.out.println(hospital.getDepartments());
	}

}
