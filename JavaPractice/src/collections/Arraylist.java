package collections;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
	
		List<Integer> list= new ArrayList<Integer>();
		
		for(int i=10;i<=100;i=i+10) {
			list.add(i);
		}
		System.out.println(list);
		
		
		list.set(4, 110);
		System.out.println(list);
		
		List<Integer> secondlist= new ArrayList<Integer>();
		
		secondlist.add(111);
		secondlist.add(222);
		secondlist.add(333);
		list.addAll(5, secondlist);
		System.out.println(list);
		
		System.out.println(list.contains(33));
		for(int j=1;j<list.size();j++) {
		System.out.println(list.get(j));
	}
		System.out.println(list);
		list.remove(5);
		System.out.println(list);
}}
