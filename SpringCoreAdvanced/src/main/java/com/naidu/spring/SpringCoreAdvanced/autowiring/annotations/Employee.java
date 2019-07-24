package com.naidu.spring.SpringCoreAdvanced.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	private Address addres;

	// we can use @Autowired at fields and constructor, setter methods
	//@Autowired(required=false)
	public Employee(Address addres) {
		this.addres = addres;
	}

	@Override
	public String toString() {
		return "Employee [addres=" + addres + "]";
	}

	public Address getAddres() {
		return addres;
	}

	@Autowired(required=false)
	@Qualifier("addres123")
	public void setAddres(Address addres) {
		this.addres = addres;
	}

}
