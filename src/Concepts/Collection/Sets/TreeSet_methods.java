package Concepts.Collection.Sets;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet_methods {
	
	public static void main(String[] args) {
		
		// empty tree set at beginning
		TreeSet treeSet = new TreeSet();
		System.out.println(treeSet);
		
		// public boolean add(E e)
		treeSet.add(1);
		treeSet.add(2);
		treeSet.add(3);
		treeSet.add(13);
		
		System.out.println(treeSet);
		
		// public E ceiling(E e)
		System.out.println("Ceiling : " +treeSet.ceiling(12));
		
		// public E floor(E e)
		System.out.println("Floor : " + treeSet.floor(12));
		
		//public boolean contains(Object o)
		boolean res = treeSet.contains(1);
		System.out.println(res);
		
		// public Iterator<E> descendingIterator()
		System.out.println();
		System.out.println("Iterating in Decending order using decending iterator");
		Iterator desIterator = treeSet.descendingIterator();
		
		while(desIterator.hasNext()) {
			System.out.println(desIterator.next());
		}
		
        //public NavigableSet<E> descendingSet()
		NavigableSet s = treeSet.descendingSet();
		System.out.println("Descending Set");
		System.out.println(s);
		
		
		// public SortedSet<E> headSet(E toElement)
		// Returns a view of the portion of this set whose elements are strictly less than toElement
		SortedSet sortedSet = treeSet.headSet(12);
		System.out.println(sortedSet);
		
		
		// public NavigableSet<E> headSet(E toElement, boolean inclusive)
		// Returns a view of the portion of this set whose elements
		// are less than (or equal to, if inclusive is true) toElement.
		NavigableSet nv = treeSet.headSet(12, true);
		
		
		// first()
		// Returns the first (lowest) element currently in this set.
		System.out.println("Lowest in set : "+treeSet.first());
		
		// public E last()
		System.out.println("Highest in set : "+treeSet.last());
		
		
		// public E higher(E e)
		// Returns the least element in this set strictly greater
		// than the given element, or null if there is no such element.
		System.out.println("Least element in set greater than 12 : " +treeSet.higher(12));
		
		
		// public E lower(E e)
		// Returns the greatest element in this set strictly less than the given element
		// or null if there is no such element.
		System.out.println("Greatest element in set less than 12 : " +treeSet.lower(12));
		
		
		// public E pollFirst()
		// Retrieves and removes the first (lowest) element, or returns null if this set is empty.
		System.out.println("Removing the lowest elemet using poll : "+treeSet.pollFirst());
		
		
		// public E pollLast()
		// Retrieves and removes the last (highest) element, or returns null if this set is empty.
		System.out.println("Removing the highest elemet using poll : "+treeSet.pollLast());
		
		System.out.println("After poll" +treeSet);
		
		System.out.println("Adding more elements ");
		treeSet.add(29);
		treeSet.add(31);
		treeSet.add(41);
		treeSet.add(61);
		
		System.out.println(treeSet);
		
		
		// public NavigableSet<E> subSet(E fromElement,
		// public NavigableSet<E> subSet(E fromElement,boolean fromInclusive,E toElement,boolean toInclusive);
		NavigableSet nvs = treeSet.subSet(1,true,5,true);
		System.out.println("Elements between 1 to 5 in this set are: "+nvs);
		
		//public NavigableSet<E> tailSet(E fromElement, boolean inclusive)
		SortedSet ss = treeSet.tailSet(29,true);
		System.out.println("Elements greater & equal to 29 : "+ ss);
}

}
