package dataStructures;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// number of rows given
		int n=sc.nextInt();
		
		int row=1;
		while(row<=n) {
			int col=1;
			while(col <= row) {
				System.out.print("1");
				col++;
			}
			row++;
			System.out.println( );
			
		}
		
		
	}

}
