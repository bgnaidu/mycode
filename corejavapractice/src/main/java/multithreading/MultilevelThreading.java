package multithreading;

public class MultilevelThreading extends Thread{

	public static void main(String[] args) {
		MultilevelThreading multilevelThreading=new MultilevelThreading();
		multilevelThreading.start();
		
		for(int j=1; j<=200;j++) {
			System.out.print("j :"+ j+ "\t");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	public void run() {
		for(int i=1; i<=200;i++) {
			System.out.print("i :"+ i+ "\t");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	

}
