package Concepts.Collection.Maps;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {

		//put()
		Hashtable<Integer,String> ht = new Hashtable();
		ht.put(1, "one");
		ht.put(2, "two");
		ht.put(3, "three");
		ht.put(4, "four");
		ht.put(5, "five");
		ht.put(6, "six");
		System.out.print("Hash Table : ");
		System.out.print(ht);
		System.out.println();
		System.out.println();
		
		
		//updating
		ht.put(6, "Six");
		
		//removing
		ht.remove(5);
		
		System.out.println("Removing 5 from Hash Tabe");
		System.out.println();
		System.out.println(ht);
		
		//getting
		System.out.println("Displaying 3rd element : " + ht.get(3));
		
		
		//	forEach(BiConsumer<? super K,? super V> action)
		System.out.println();
		System.out.println("Traversing over Hash Table");
		ht.forEach((key,value)->
						System.out.println(key+ ":"+value)
					);
		
		
		System.out.println();
		System.out.println(" Traversing using Enumeration ");
		Enumeration<Integer> e = ht.keys();
		

		while(e.hasMoreElements()) {
			int key = e.nextElement();
			System.out.println("Key : " +key);
			System.out.println("Value : " + ht.get(key));
		}
		
		
		// public int size()
		// Returns the number of keys in this hashtable.
		System.out.println("Size : " + ht.size());
	}
}
