package com.naidu.springCore.interfaceinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("bo")
public class OrderBoImpl implements OrderBO {
   
	@Autowired
	private OrderDao dao;
	
	@Override
	public void placeOrder() {
		System.out.println("inside order BO place order");
		dao.createOrder();
	}

	public OrderDao getDao() {
		return dao;
	}

	public void setDao(OrderDao dao) {
		this.dao = dao;
	}

}
