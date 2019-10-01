package exceptionhandling;

import java.util.Scanner;

public class Try_Catch {

	public static void main(String[] args) {
		try {
  Scanner sc=new Scanner(System.in);
  int i=sc.nextInt();
  int j=sc.nextInt();
  int result=i/j;
  System.out.println("result op is:"+result);
	}
	catch(Exception e) {
		System.out.println("please do not enter 0");
		
	}
System.out.println("executed try-catch");
}
}