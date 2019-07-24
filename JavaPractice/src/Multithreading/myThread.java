package Multithreading;

public class myThread extends Thread {

	Displaymessage dm;
	String name;
	public myThread(Displaymessage dm, String name) {
		this.dm=dm;
		this.name=name;
	}
	public void run() {
		dm.display(name);
	}
}
