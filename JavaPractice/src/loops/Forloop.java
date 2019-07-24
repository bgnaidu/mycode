package loops;

public class Forloop {

	public static void main(String[] args) {
		String str="abcdefghijklmnopqrstuvwxyz";
		
		
		for(int i=str.length()-1;i>=0;i--) {
			System.out.println(str.charAt(i));
		}
		int Counter=0;
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=10;j++) {
				System.out.println("j lopp is"+j+"i loop is:"+i);
				System.out.println("counter:"+Counter++);
			}
			
		}
		

	}

}
