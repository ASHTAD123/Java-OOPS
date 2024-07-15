package Concepts.Collection.Sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_methods {
	
	public static void main(String[] args) {

		
		// boolean add(E e)
		 Set<String> hs = new HashSet<String>();
		 hs.add("Ash");
		 hs.add("Ashu");
		 hs.add("Ashy");
		 System.out.println(hs);
	
		 // boolean contains(Object o)
		 String string ="Ash";
		 boolean res = hs.contains(string);
		 System.out.println(res);
		 
		 // int hashCode()
		 int hc = hs.hashCode();
		 System.out.println("Hash code : " + hc);
		 
		 // boolean isEmpty()
		 boolean isEmpty = hs.isEmpty();
		 System.out.println(isEmpty);
		 
		 // Iterator<E> iterator()
		 Iterator i = hs.iterator();
		 
		 while(i.hasNext()) {
			 System.out.println(i.next());
		 }
		 
		 
		 // Constructors
		 HashSet hashSet = new HashSet();
		 
		 HashSet hashSet1 = new HashSet(hs);
		 System.out.println(hashSet1);
		 
		 HashSet hashSet2 = new HashSet(16);
		 System.out.println("Size : " + hashSet2.size());
		 
		 // HashSet(int initialCapacity, float loadFactor)
		 HashSet hs1 = new HashSet(20,0.75f);
		 
	}
}
