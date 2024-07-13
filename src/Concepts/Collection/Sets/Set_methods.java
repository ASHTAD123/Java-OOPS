package Concepts.Collection.Sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Set_methods {

	public static void main(String[] args) {

		// boolean add(E e)
		Set s = new HashSet<String>();
		s.add(62);
		s.add(54);
		s.add(82);
		s.add(21);
		s.add(42);
		s.add(45);
		s.add(35);
		s.add(35);
		s.add(25);
		s.add(25);
		System.out.println(s);

		// addAll(Collection<? extends E> c)
		List l = new ArrayList();
		l.addAll(s);
		Iterator i = l.listIterator();

		while (i.hasNext()) {
			System.out.print(i.next() + ",");
		}

		System.out.println();
		
		// Mathematical operations using Set
		
		//SET A
		Set<Integer> a = new HashSet<Integer>();
		a.addAll(Arrays.asList(new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));
		System.out.println();
		System.out.println("Set A ");
		System.out.println(a);
		
		//SET B
		Set<Integer> b = new HashSet<Integer>();
		b.addAll(Arrays.asList(new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));
		System.out.println("Set B ");
		System.out.println(b);
		
		// Union
		Set<Integer> union = new HashSet<Integer>(a);
		union.addAll(b);
		System.out.print("Union of the two Set");
	    System.out.println(union);
		
		// Intersection
	    Set<Integer> intersection = new HashSet<Integer>(a);
		intersection.retainAll(b);
		System.out.print("Intersection of the two Set");
	    System.out.println(union);
		
		// Difference
	    Set<Integer> difference = new HashSet<Integer>(a);
	    difference.removeAll(b);
	    System.out.print("Difference of the two Set");
        System.out.println(difference);
		
		
		
		
		
		
		
		
	}
}
