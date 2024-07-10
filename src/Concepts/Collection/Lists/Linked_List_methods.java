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
		System.out.println("------ add(int index, E element) executed ------");
		System.out.println(linkedList);

		Collection c = new Vector();
		c.add("Friend 5");
		c.add("Friend 6");
		c.add("Friend 7");

		// addAll(Collection<? extends E> c)
		System.out.println();
		linkedList.addAll(c);
		boolean res = linkedList.addAll(c);
		System.out.println("------ addAll(Collection<? extends E> c) executed ------");

		System.out.println(linkedList);
		System.out.println("method returned : " + res);

		// addFirst(E e)
		System.out.println();
		linkedList.addFirst("Friend First");
		System.out.println("------ addFirst() executed ------");
		System.out.println(linkedList);

		// addLast(E e)
		System.out.println();
		linkedList.addLast("Friend Last");
		System.out.println("------ addLast() executed ------");
		System.out.println(linkedList);
		System.out.println();
		
		
		// descendingIterator()
		// Returns an iterator over the elements in this deque
		// in reverse sequential order.
		
		System.out.println(" --------- descendingIterator()--------");
		Iterator i = linkedList.descendingIterator();
		i.forEachRemaining(n-> System.out.print(n+","));
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
