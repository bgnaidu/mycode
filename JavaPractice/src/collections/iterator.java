package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class iterator {

	public static void main(String[] args) {
		TreeSet<Integer> treeset=new TreeSet<>();
		
		
		for (int i=1;i<=10;i++) {
			
			treeset.add(i);
			
		}
//		System.out.println(treeset);
		Iterator<Integer> itr= treeset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			itr.remove();
		}
		
		System.out.println(treeset);
	}

}
