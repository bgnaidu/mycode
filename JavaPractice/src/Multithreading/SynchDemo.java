package Multithreading;

public class SynchDemo {

	public static void main(String[] args) {
		
Displaymessage dm=new Displaymessage();
myThread t2=new myThread(dm, "Jhanu");
myThread t1=new myThread(dm, "naidu");


t2.start();
t1.start();
	}

}
