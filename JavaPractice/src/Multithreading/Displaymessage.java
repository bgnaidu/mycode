package Multithreading;

public class Displaymessage {

	public  synchronized void display(String name) {
		for(int i=0;i<=10;i++) {
			System.out.println("how are you"+name);
		}
	}
}
