package dataStructures;

import java.util.Scanner;

public class EvenSumAndOddSum {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		
 int evensum = 0, oddsum=0;
 
 while(num>0) {
	 int last=num%10;
	 if(last%2==0) {
		 evensum+=last;
	}else {
		oddsum+=last;
	}
	 num=num/10;
 }
 System.out.println("even sum="+evensum +" odd sum="+oddsum);
	}

}
