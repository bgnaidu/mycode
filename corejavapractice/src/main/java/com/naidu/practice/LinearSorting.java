package com.naidu.practice;

public class LinearSorting {
	
	public static int sort(int[] arr, int n) {
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==n) 
				return i;
			
			
		}
		return -1;
		
	}

	public static void main(String[] args) {
		
		int array[]= {1,2,3,4,10,20,24};
		int n=10;
		LinearSorting linearSorting=new LinearSorting();
		int result=linearSorting.sort(array, n);
		if(result == -1) 
	        System.out.print("Element is not present in array"); 
	    else
	        System.out.print("Element is present at index " + result); 
	} 
		
		
		
	}


