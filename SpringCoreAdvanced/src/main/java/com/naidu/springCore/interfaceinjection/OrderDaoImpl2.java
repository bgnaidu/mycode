package com.naidu.springCore.interfaceinjection;

public class OrderDaoImpl2 implements OrderDao {

	@Override
	public void createOrder() {
		System.out.println("inside orerDao impl2 create order");
	}

}
