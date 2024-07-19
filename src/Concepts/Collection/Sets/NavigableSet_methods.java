package Concepts.Collection.Sets;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSet_methods {

	public static void main(String[] args) {

		NavigableSet<String> nv = new TreeSet<>();
		nv.add("String 1");
		nv.add("String 2");
		nv.add("String 3");
		nv.add("String 4");
		nv.add("String 5");
		nv.add("String 6");
		nv.add("String 7");
		nv.add("String 8");
		nv.add("String 9");
		nv.add("String 10");

		System.out.println(nv);

		NavigableSet<Integer> ns = new TreeSet<>();
		ns.add(0);
		ns.add(1);
		ns.add(2);
		ns.add(3);
		ns.add(3);
		ns.add(4);
		ns.add(5);
		ns.add(6);
		
		// E ceiling(E e)
		// Returns the least element in this set >= to the given element,
		// or null if there is no such element.
		System.out.println(" Celing of 3 : " +ns.ceiling(3));
		
		System.out.println(" Before poll : " + ns);
		
		// E pollFirst()
		System.out.println(" Retreiving & removing lowest element : " +ns.pollFirst());
		
		// E pollLast()
		System.out.println(" Retreiving & removing the highest element :" +ns.pollLast());
		
		System.out.println(" After poll : " +ns);
	
		Set descSet = ns.descendingSet();
		System.out.println(" Descending view : " + descSet);
	
	
	}	
}
