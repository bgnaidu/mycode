package maps;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queuedemo {

	public static void main(String[] args) {
	Queue<Integer> queue=new PriorityQueue<>();
	
	for (int i=10;i<=20;i++) {
		queue.offer(i);
		
	}
	// it gives output as insertion order
	System.out.println(queue);
	System.out.println("peek vale:"+queue.peek());
	System.out.println(queue.poll());
	//once we remove element it doesnt follow the insertion order
	System.out.println(queue);
	System.out.println(queue.remove());
	System.out.println("After removing:"+queue);
	}

}
