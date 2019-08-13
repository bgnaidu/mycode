package com.naidu.springCore.Lc.springconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PatientTest {

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/naidu/springCore/Lc/springconfig/lcconfig.xml");
		Patient patient = (Patient) applicationContext.getBean("patient");

		System.out.println(patient);

		applicationContext.registerShutdownHook();

	}

}
