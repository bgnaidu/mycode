package recursion;

public class Recursion {

	public static void main(String[] args) {
	//	printhello(5);
	//	System.out.println("recursiom method stopped");
		printNumber(4);
	}
	private static int printNumber(int i) {
		if(i==0) {
			return 0;
		}else {
			System.out.println(i);
			return printNumber(i-1);
		}
		
	}
	static void printhello( int i) {
		System.out.println("recusrsion method demo");
		i++;
		if(i<100) {
		printhello(i);
	}
		
		
		
		
	}
}
