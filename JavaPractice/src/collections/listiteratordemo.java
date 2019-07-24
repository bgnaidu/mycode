package collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class listiteratordemo {

	public static void main(String[] args) {
		List<String> set=new LinkedList<>();
		
 set .add("abc");
 set.add("efg");
 set.add("abb");
 
	ListIterator<String> iterator=set.listIterator();
	
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
		
	}
	System.out.println("traversing backward direction");
  while(iterator.hasPrevious()) {
	  System.out.println(iterator.previous());
  }
}}
