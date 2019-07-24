package com.naidu.springCore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext act= new ClassPathXmlApplicationContext("com/naidu/springCore/set/Setconfig.xml");
	Cardealer deal = (Cardealer) act.getBean("cardeal");
	System.out.println(deal.getName());
	System.out.println(deal.getModels());
	}

}
