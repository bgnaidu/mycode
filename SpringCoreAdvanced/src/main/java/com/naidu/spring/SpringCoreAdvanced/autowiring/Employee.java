package com.naidu.spring.SpringCoreAdvanced.autowiring;

public class Employee {

	private Address addres;

	

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

	public void setAddres(Address addres) {
		this.addres = addres;
	}

}
