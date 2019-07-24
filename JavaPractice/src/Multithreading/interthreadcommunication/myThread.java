package Multithreading.interthreadcommunication;

public class myThread extends Thread {

	
	int total;
	public void run() {
		System.out.println("the child thread has calculating the result");
		synchronized (this) {
			
		
		for (int i=0;i<=50;i++) {
			total+=i;
			
		}
		this.notify();
		}
	}
}
