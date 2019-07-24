package Sample.coreprograms;

import java.util.Scanner;

public class Forloop    {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//for loop
      for (int i=10; i>=0; i--) {
    	  System.out.println(i);
      }
      //for each loop
      int numbers[]= {1,2,3,4,5,6,7,8,9};
      
      for(int items:numbers) {
      System.out.println(items);
	}
      //while loop
      Scanner sc =new Scanner(System.in);
      String value;
      while(true) {
    	  System.out.println("enter letter...");
    	  value=sc.nextLine();
    	  if(value.equals("q")) {
    		  
    		break;  
    	  }
      }
      //switch
      int i=1;
      
      switch (i) {
	case 1:
		System.out.println("its is the 1st case");
		break;
	case 2:
	System.out.println("it is the 2nd case");
	break;
	default:
		System.out.println("whatever it is");
		break;
	}
	}
}
