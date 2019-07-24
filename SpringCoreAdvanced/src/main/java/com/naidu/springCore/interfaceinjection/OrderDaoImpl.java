package com.naidu.springCore.interfaceinjection;

import org.springframework.stereotype.Component;

@Component
public class OrderDaoImpl implements OrderDao {

	@Override
	public void createOrder() {
		System.out.println("Inside orderdAO crteate order");
	}

}
