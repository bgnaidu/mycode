package Sample.coreprograms;

public class Copyarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  char[] copyfrom= {'d', 'e', 'c', 'a', 'f', 'f', 'e',
		    'i', 'n', 'a', 't', 'e', 'd' };
  char[] copyto= new char[7];
  
  System.arraycopy(copyfrom, 2, copyto, 0, 7);
  System.out.println(new String(copyto));
  
  // pre and post incrementals
	        int i = 3;
	        i++;
	        System.out.println(i);    // "4"
	        ++i;                     
	        System.out.println(i);    // "5"
	        System.out.println(++i);  // "6"
	        System.out.println(i++);  // "6"
	     
	        System.out.println(i);    // "7"
	        System.out.println(++i);
	       
	       }
	    
	
	}


