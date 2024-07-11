package Concepts.Collection.Lists;

import java.util.Stack;

public class Stack_methods {

	public static void main(String[] args) {
		
		// public E push(E item)
		Stack<Integer> stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		int a =stack.push(4);
		System.out.println(stack);
		System.out.println("Push element returned : " +a);
		
		// public E pop()
		int b =stack.pop();
		System.out.println("Pop element returned : " +b);
		
		// public E peek()
	}
}
