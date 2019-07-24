package dataStructures;

import java.util.Scanner;

public class AlphaPattern {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	int i,j;
	char ch='A';
	
	for(i=0;i<n;i++) {
		for(j=0;j<=i;j++) {
			System.out.print(ch);
			
		}
		ch++;
		System.out.println();
		
	}

	}

}
