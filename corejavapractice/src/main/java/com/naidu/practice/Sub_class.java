package com.naidu.practice;

public class Sub_class extends Method_Overriding{
	
	public void m1() {
		System.out.println("child overridng method");
	}
	static void m2() {
		System.out.println("static method overriding in child class");
	}
	
	public static void main(String[] args) {
		Method_Overriding method_Overriding=new Sub_class();
		method_Overriding.m1();
		method_Overriding.m2();
	
}}