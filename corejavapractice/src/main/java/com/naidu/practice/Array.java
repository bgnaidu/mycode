package com.naidu.practice;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		int [] numbers= {1,2,3,4,5,6,7,8};
		int sum=0;
	
		for(int i:numbers) {
			sum += i;
			System.out.println(sum);
		}
		
	
	int myarray[]= {56234, 2345,3456,4567,5678,6789,7890};
	String  myarray2[]= {"bgnaidu","gnaidu1","wnaidu2", "hnaidu3","mnaidu4","naidu5"};
	
	System.out.println("Original numeric array : "+Arrays.toString(myarray));
	Arrays.sort(myarray);
	System.out.println("Sorted numeric array : "+Arrays.toString(myarray));
	
			
	System.out.println("Original String array : "+Arrays.toString(myarray2));
	Arrays.sort(myarray2);
	System.out.println("sorted String array : "+Arrays.toString(myarray2));
	
	}
}
