package dataStructures;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> stack=new Stack<>();
		stack.push("hi");
		stack.push("hello");
		stack.push("howru");
		stack.push("iamfine");
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}

	}

}
