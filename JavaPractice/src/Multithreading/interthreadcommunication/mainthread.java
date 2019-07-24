package Multithreading.interthreadcommunication;

public class mainthread {

	public static void main(String[] args) throws InterruptedException {
		myThread myThread=new myThread();
		myThread.start();
		
synchronized (myThread) {
	System.out.println("main thread is going to wait");
	myThread.wait();
	System.out.println("main thread is notified");
	System.out.println(myThread.total);
}
	}

}
