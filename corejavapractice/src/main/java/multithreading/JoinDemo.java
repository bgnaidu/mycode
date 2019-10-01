package multithreading;

import java.util.Scanner;

public class JoinDemo extends Thread {
	
  static int n=0,Sum;
	public static void main(String[] args) {
		long starttime=System.currentTimeMillis();
		System.out.println("Enter the Number:");
  Scanner sc=new Scanner(System.in);
  JoinDemo.n=sc.nextInt();
  System.out.println("Given number is:"+JoinDemo.n);
  
  JoinDemo jd=new JoinDemo();
  jd.start();
  try {
	jd.join();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  long endtime=System.currentTimeMillis();
  System.out.println("sum on 'N':"+JoinDemo.n + " number is:"+JoinDemo.Sum);
  long timetaken= endtime-starttime;
  System.out.println("total time taken is:"+timetaken/100+" seconds");
  
  
	}
	
	public void run() {
		for(int i=1; i<=JoinDemo.n;i++) {
		JoinDemo.Sum += i;
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	System.out.println(JoinDemo.Sum);
			
		}
	}

}
