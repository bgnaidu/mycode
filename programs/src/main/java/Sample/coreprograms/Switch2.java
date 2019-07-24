package Sample.coreprograms;

public class Switch2 {

	public static void main(String[] args) {
		
		int month=2;
		int year=2005;
		int numberofdays = 0;
		 switch(month) {
		 case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			 numberofdays=31;
			 break;
		 case 4: case 6:
         case 9: case 11:
        	 numberofdays=30;
        	 break;
         case 2:
        	 if (((year % 4 ==0)&& !(year % 100==0)) ||(year% 400==0))
        		 
        	 numberofdays=29;
        	 else
        		 numberofdays=28;
        	 break;
        	 default:
        		 System.out.println("incvalid");
        		 break;
		 }
   System.out.println("number of days for the month are ="+numberofdays);
   
   // do while statement
  int  count=1;
   do 
   {
	   System.out.println("count:"+count);
	   count++;
   }
   while(count<=11);
   
   
   
	   
   
   
	}

	
	
}
