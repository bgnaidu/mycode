package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Hashsetdemo {

	public static void main(String[] args) {
	
		Random random=new Random();
		
		List<Integer> list=new ArrayList<>();
		
		for(int i=0;i<=6;i++) {
			int numbers=random.nextInt(100);
				list.add(numbers);
			System.out.println(numbers);
		}
		//linked hash set maintains in order to print objects
	LinkedHashSet<Integer> lhashSet=new LinkedHashSet<>(list);
	//hash set doesnt maintain order
		Set<Integer> set=new HashSet<>(list);
		// treeset has maintains ascending order
		Set<Integer> treeset=new TreeSet<>(list);
		
		System.out.println("set numbers are;"+set);
		System.out.println("linked hash set numbers are:"+lhashSet);
		System.out.println("tree set numbers are:"+treeset);
		
		

	}

}
