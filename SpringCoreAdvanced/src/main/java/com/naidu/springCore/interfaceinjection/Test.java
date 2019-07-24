package com.naidu.springCore.interfaceinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
   ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/naidu/springCore/interfaceinjection/config.xml");
   OrderBO bean = (OrderBO) applicationContext.getBean("bo");
   bean.placeOrder();
	}

}
