package com.naidu.practice.Abstarction;

public abstract class BMW {
	
	void commanFunc() {
		System.out.println("inside common function");
	}
	abstract void accelartion();
	
	public static void main(String[] args) {
		System.out.println("inside main method");
	}

}
