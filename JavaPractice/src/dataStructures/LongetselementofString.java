package dataStructures;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongetselementofString {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("one two");
		list.add("three");
		list.add("one two three four");
		list.add("four");
				System.out.println(findLongestLengthOfWordInList(list));


	}

	private static String findLongestLengthOfWordInList(List<String> list) {
		Set<String> s=new HashSet<>(list);
		String lastElement="";
		for(String str:s) 
			lastElement=str;
			
			
	
		return lastElement;
		
		
	}

}
