package dataStructures;

import java.util.Scanner;

public class TotalSalary {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int salary=scanner.nextInt();
		char grade=scanner.next().charAt(0);
			System.out.println("salary is"+salary);
			System.out.println("garde is"+ grade);

			double hra=0.2*salary;
			double da=0.5*salary;
			double pf=0.11*salary;
			
			int allowance;
			if(grade=='A') {
				allowance=1700;
			}
			else if(grade=='B') {
				allowance=1500;
			}
			else{
			allowance=1000;
			}
			double totalsalary=salary+allowance+hra+da-pf;
			int ans=(int)Math.round(totalsalary);
			System.out.println(ans);
			
	}

}
