package Concepts.Collection.Maps;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_methods {

	public static void main(String[] args) {
		
		ConcurrentHashMap chm = new ConcurrentHashMap();
		
		
		chm.put(1, "one");
		chm.put(2, "two");
		chm.put(3, "three");
		chm.put(4, "four");
		chm.put(5, "five");
		
		
		// putIfAbsent(K key, V value)
		//If the specified key is not already associated with a value,
		//associate it with the given value.
		chm.putIfAbsent(6, "six");
		chm.put(5, "five");
		
		System.out.println(chm);
		
		
		
		//remove only if both key & value are present
		chm.remove(1,"one");
		System.out.println(chm);
		
		
		//replace only if both key & value are present
		chm.replace(5, "five","Five");
		
		
		
		//Traversing
		Iterator<ConcurrentHashMap.Entry<Integer, String> > itr = chm.entrySet().iterator();
		
		while(itr.hasNext()) {
			 ConcurrentHashMap.Entry<Integer, String> entry = itr.next();
			 
			   System.out.println("Key = " + entry.getKey()
               + ", Value = "
               + entry.getValue());
		}
	
		chm.compute(5,(key,val)->val+"five");
		
		
		System.out.println(chm);
		
		//getOrDefault(Object key, V defaultValue)
		//Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.
		System.out.println(chm.getOrDefault(7,"seven"));
		
		
	
	}

}
