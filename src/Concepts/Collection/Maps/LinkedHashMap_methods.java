package Concepts.Collection.Maps;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMap_methods {

	public static void main(String[] args) {
		
		LinkedHashMap lhmp = new LinkedHashMap();
		
		lhmp.put(1, "A");
		lhmp.put(2, "B");
		lhmp.put(3, "C");
		lhmp.put(4, "D");
		lhmp.put(5, "E");
		
		System.out.println("Linked Hash Map :" +lhmp);
		
		
		//remove method
		System.out.println("Removing last mapping");
		lhmp.remove(5);
		System.out.println("Updated Map : "+lhmp);
		
		// 	entrySet()
		Set entrySet = lhmp.entrySet();
		
		System.out.println("Set view of the map : "+entrySet);
	}
}
