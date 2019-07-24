package oops;

public class MethodOverloading {

	
//	public void  runOncycle(String name) {
//		System.out.println(name);
//	}
/*public void  runOncycle(String name, int speed) {
	System.out.println(speed);
	}*/
public void  runOncycle(int speed ,String name, double number ) {
System.out.println(speed);
System.out.println(name);
System.out.println(number);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading methodOverloading=new MethodOverloading();
		//methodOverloading.runOncycle("naidu");
		
		methodOverloading.runOncycle(40,  "naidu",3431);
	}

}
