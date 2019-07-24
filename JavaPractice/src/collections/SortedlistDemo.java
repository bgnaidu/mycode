package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedlistDemo {

	public static void main(String[] args) {
	 List<String> list=new ArrayList<>();
	 list.add("z");
	 list.add("i");
	 list.add("n");
	 list.add("a");
	 
	 System.out.println("before sorting list:"+list);
	 
	 Collections.sort(list);
	 System.out.println("after sorting list:"+list);

	 int binarySearch = Collections.binarySearch(list, "D");
	 System.out.println(binarySearch);
	 
	 
	}

}
