package Multithreading;

import java.util.Scanner;

public class Multithread extends Thread {

	
	static int n, Sum=0;
	public void run() {
		for(int i=1;i<=Multithread.n;i++) {
			
			Multithread.Sum +=i;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
	long starttime = System.currentTimeMillis();
		System.out.println("enter number");
		Scanner scanner=new Scanner(System.in);
		Multithread.n=scanner.nextInt();
		
		Multithread multithread=new Multithread();
		multithread.start();
		try {
			multithread.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("the sum of n numbers is:"+Multithread.Sum);
		long endtime = System.currentTimeMillis();
		System.out.println("total time taken by:"+(endtime-starttime)/1000+" Seconds");
	}

	
	
}
