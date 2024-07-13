package Concepts.Collection.Lists;

import java.util.AbstractList;
import java.util.Stack;

public class Stack_methods {

	public static void main(String[] args) {
		
		// public E push(E item)
		Stack<Integer> stack = new Stack();
		stack.push(1);//last position
		stack.push(2);// 2nd pos
		stack.push(3);// 1st pos
		int a =stack.push(4);
		System.out.println(stack);
		System.out.println(" Push element returned : " +a);
		
		// public E pop()
		int b =stack.pop();
		System.out.println(" Pop element returned : " +b);
		
		
		// public E peek()
		// its LIFO so last element
		System.out.println(" Peek element " +stack.peek());
		
		
		// public boolean empty()
		System.out.println(" Stack isEmpty() :" + stack.isEmpty());
		
		
		// public int search(Object o)
		// it counts position from 1 , not zero
		System.out.println(" Offset after searching : "+stack.search(3));
	
	}
}
