package Sample.coreprograms;

import java.util.Arrays;

public class PrintName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "naidu";
		String str = "X";
//		str = str.replaceAll("X", "XXXXXXXXXX");
//		str = str.replaceAll("X", "XXXXXXXXXX");
//		str = str.replaceAll("X", "XXXXXXXXXX");
//		str = str.replaceAll("X", name + "\n");
		str=str.replaceAll("X", "XXXXXXXXXX");
		str=str.replaceAll("X", "XXXXXXXXXX");
		str=str.replaceAll("X", "XXXXXXXXXX");
		str = str.replaceAll("X", name + "\n");
		//System.out.println(str);
		 String[] myName = new String[1000];
		  Arrays.parallelSetAll(myName, i -> "Shreyash");   	
		//	System.out.print(Arrays.toString(myName));
			
			String myname="    gnaidu   ";
			String st=myname=myname.trim();
		//String st=	myname.replaceAll("\\s+","");
			System.out.println(st);
	}

}
