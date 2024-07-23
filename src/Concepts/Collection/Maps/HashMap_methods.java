package Concepts.Collection.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_methods {

	public static void main(String[] args) {
		
		//creating hashmap
		HashMap<Integer,String> myMap = new HashMap();
	
		//adding elements
		myMap.put(1,"a" );
		myMap.put(2,"b" );
		myMap.put(3,"c" );
		myMap.put(4,"d" );
		myMap.put(5,"e" );
		myMap.put(6,"f" );
		myMap.put(7,"g" );
		myMap.put(8,"h" );
		myMap.put(9,"i" );
		myMap.put(10,"j");
		System.out.println("Printing Map : " +"\n"+myMap);
	
		//public boolean isEmpty()
		System.out.println("Is the map empty : " +myMap.isEmpty());
		
		//getting value
		System.out.println("Getting values from map");
		System.out.print(myMap.get(1)+",");
		System.out.print(myMap.get(5)+",");
		System.out.print(myMap.get(10));
		System.out.println();
		
		
		//public Set<K> keySet()
		//Returns a Set view of the keys contained in this map.
		Set s = myMap.keySet();
		System.out.println("Printing set view of HashMap : " +s);
		System.out.println();
		System.out.println(" Removing an element from Set ");
		
		s.remove(10);
		System.out.println("Set : " +s);
		System.out.println("Map : " +myMap);
		System.out.println("By making changes in set , it resulted to reflect in map ,because the set is backed by the map, so changes to the map are reflected in the set, and vice-versa");
		System.out.println();
		
		//public boolean containsKey(Object key)
		System.out.println("Does it contains key named as 1 ? " +"\n"+myMap.containsKey(1));
	
		System.out.println();
		
		//public Set<Map.Entry<K,V>> entrySet()
		// Returns a Set view of the mappings contained in this map. 
		System.out.println(" Returning Set view of mappings of this map");
		Set entrySet = myMap.entrySet();
		System.out.println(entrySet);
		
		//public int size()
		//Returns the number of key-value mappings in this map.
		System.out.println("Number of key-value mappings in this map are :");
		System.out.println("Size : " + myMap.size());
		
		// public Collection<V> values()
		// Returns a Collection view of the values contained in this map.
		System.out.println(" Collection view of the values contained in this map ");
		System.out.println(myMap.values());

		// public V compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)
		System.out.println("Updating a value using compute()");
		
		//myMap.compute(10, (key,val) 
		//					->val.concat(" is the last alphabet in set"));
		
		
		
		// public V replace(K key,V value)
		   System.out.println("Replacing values in Map");
		   myMap.replace(9, "z");
		   System.out.println("Updated Map : "+myMap);
		
		
		  //Iterating the map
		   for(Map.Entry<Integer,String> e : myMap.entrySet()) {
			   System.out.println("Key : " +e.getKey());
			   System.out.println("Value : " +e.getValue());
		   }
		
		
		
	}
}
