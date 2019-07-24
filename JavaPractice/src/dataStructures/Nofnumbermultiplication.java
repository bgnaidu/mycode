package dataStructures;

import java.util.Scanner;

public class Nofnumbermultiplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int x=sc.nextInt();
		int n=sc.nextInt();
		int ans=1;
		while(n>0) {
			ans *=x;
			n--;
			
		}
		System.out.println(ans);
	
		for(int i=0;i<=10;i++) {
			System.out.println( x+" * "+i+" = "+x*i);
			
			
		}
	}
	

}
