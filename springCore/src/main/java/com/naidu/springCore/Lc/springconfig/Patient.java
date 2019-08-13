package com.naidu.springCore.Lc.springconfig;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("inside setter method");
		this.id = id;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	public void hi() {
		System.out.println("Inside hi method");
	}

	public void bye() {
		System.out.println("Inside Bye method");
	}
}
