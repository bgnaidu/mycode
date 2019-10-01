package multithreading;

public class Singlethreading {

	public static void main(String[] args) {
		Singlethreading singlethreading=new Singlethreading();
		singlethreading.printnumbers();
		for(int j=1; j<=200;j++) {
			System.out.print("j :"+ j+ "\t");
			
		}
	}
	void printnumbers() {
		for(int i=1; i<=200;i++) {
			System.out.print("i :"+ i+ "\t");
			
		}
	}

}
