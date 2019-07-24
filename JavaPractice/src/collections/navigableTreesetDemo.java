package collections;

import java.util.TreeSet;

public class navigableTreesetDemo {

	public static void main(String[] args) {
	 TreeSet<Integer> treeset=new TreeSet<>();
	 for(int i=10;i<=50;i=i+10) {
		 treeset.add(i);
	}
	 
System.out.println(treeset);
System.out.println("calling ceiling method:"+treeset.ceiling(20));
System.out.println("calling floor method:"+treeset.floor(19));
System.out.println("calling higher method:"+treeset.higher(11));
System.out.println("calling lower method:"+treeset.lower(29));
System.out.println("calling pollfirst method:"+treeset.pollFirst());
System.out.println("calling polllast method:"+treeset.pollLast());
System.out.println(treeset.descendingSet());
	}

}
