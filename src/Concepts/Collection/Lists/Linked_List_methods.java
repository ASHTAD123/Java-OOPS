package Concepts.Collection.Lists;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class Linked_List_methods {

	public static void main(String[] args) {

		// add() method
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Ashu");
		linkedList.add("Chikuu");
		linkedList.add("Geetu");
		linkedList.add("Kaushik");
		System.out.println(linkedList);

		// add(int index, E element)
		System.out.println();
		linkedList.add(4, "Nishh");
		System.out.println("------ add(int index, E element) ------");
		System.out.println(linkedList);

		Collection c = new Vector();
		c.add("Friend 5");
		c.add("Friend 6");
		c.add("Friend 7");

		// addAll(Collection<? extends E> c)
		System.out.println();
		linkedList.addAll(c);
		boolean res = linkedList.addAll(c);
		System.out.println("------ addAll(Collection<? extends E> c) ------");

		System.out.println(linkedList);
		System.out.println("method returned : " + res);

		// addFirst(E e)
		System.out.println();
		linkedList.addFirst("Friend First");
		System.out.println("------ addFirst() ------");
		System.out.println(linkedList);

		// addLast(E e)
		System.out.println();
		linkedList.addLast("Friend Last");
		System.out.println("------ addLast() ------");
		System.out.println(linkedList);
		System.out.println();

		// descendingIterator()
		// Returns an iterator over the elements in this deque
		// in reverse sequential order.

		System.out.println(" --------- descendingIterator()--------");
		Iterator i = linkedList.descendingIterator();
		i.forEachRemaining(n -> System.out.print(n + ","));
		System.out.println();

		
		// public E peek() from Queue(I)
		System.out.println();
		System.out.println(" --------- peek()--------");
		LinkedList linked = new LinkedList();
		linked.add("0");
		linked.add("1");
		linked.add("2");
		System.out.println("Returned peek element " + linked.peek());
		
		
		// public E peekLast()
		System.out.println("Returned last peek " + linked.peekLast());
		Object o = linked.peekLast();
		System.out.println(o);
		
		
		// public E poll()
		System.out.println();
		System.out.println("--------- poll()--------");
		System.out.println("List : " +linked);
		Object o1 = linked.poll();
		System.out.println("Removed & returned first element " +o1);
		System.out.println(linked);
		
		// public E pop()
		System.out.println();
		System.out.println("--------- pop()--------");
		System.out.println("List : " +linked);
		Object o2 =linked.pop();
		System.out.println("Popped element : " + o2);
		System.out.println("After Pop " +linked);
		
		// public void push(E e)
		System.out.println();
		System.out.println("--------- push()--------");
		System.out.println("List : " +linked);
		linked.push(11);
		System.out.println(linked);
	}

}
