package Concepts.Collection.Sets;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashedSet_methods {

	public static void main(String[] args) {
		
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("A");
		lhs.add("B");
		lhs.add("C");
		lhs.add("D");
		lhs.add("E");
		lhs.add("F");
		lhs.add("G");
				
		System.out.println(lhs);
		
		System.out.println("Size of LinkedHashSet :" +lhs.size());
		
		System.out.println("Removing A :" + lhs.remove("A"));
		
		System.out.println(lhs);
		
		System.out.println("Does it contain A" + lhs.contains("A"));
		
		System.out.println();
		
		System.out.println("Iterating over an LinkedHashSet ");
		
		Iterator i = lhs.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
			System.out.print(",");
		}
		
		System.out.println("Adding element to Start of LinkedHashSet ");
		lhs.addFirst("AA");
		System.out.println(lhs);
		
		System.out.println("Adding element to Last of LinkedHashSet ");
		lhs.addLast("ZZ");
		System.out.println(lhs);
		
		System.out.println("Removing 1st element of LinkedHashSet");
		lhs.removeFirst();
		System.out.println(lhs);
		
		System.out.println("Removing last element of LinkedHashSet");
		lhs.removeLast();
		System.out.println(lhs);
		
		System.out.println("Reverse of this LinkedHashSet is : ");
		lhs.reversed();
		System.out.println(lhs);
		
	}
}
