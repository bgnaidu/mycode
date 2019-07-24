package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseListDemo {

	public static void main(String[] args) {
		 List<String> list=new ArrayList<>();
		 
		 list.add("naidu");
		 list.add("i am");
		 list.add("modi");
		 list.add("ssa");
		 System.out.println("before reversing list is:"+list);
		 Collections.reverse(list);
		 System.out.println("after reversing list is:"+list);
		 
		 // String as list
		 String[] s= {"naidu","jhanu", "jaggu"};
		for(String s1:s) {
			System.out.println(s1);
		}
		 List<String> list1=Arrays.asList(s);
		 System.out.println(list1);
	}

}
