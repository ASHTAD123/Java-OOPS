package Concepts.Collection.Maps;

import java.util.TreeMap;

public class TreeMap_methods {

	public static void main(String[] args) {

		TreeMap<Integer,String> treeMap = new TreeMap();
		treeMap.put(1, "one");
		treeMap.put(2, "two");
		treeMap.put(3, "three");
		treeMap.put(0, "zero");
		treeMap.put(7, "seven");
		treeMap.put(10, "ten");
		treeMap.put(50, "fifty");
		System.out.println("Tree Map :" + treeMap);
		
		
		// public Map.Entry<K,V> ceilingEntry(K key)
		//Returns a key-value mapping associated with the least key greater than 
		//or equal to the given key, or null if there is no such key.
		System.out.println("Celing key of 8 : " +treeMap.ceilingKey(8));
		
		
		// public Map.Entry<K,V> firstEntry()
		// Returns a key-value mapping associated with the least key 
		// in this map, or null if the map is empty.
		System.out.println("First key-value pair : " + treeMap.firstEntry());
		
		
		// public SortedMap<K,V> subMap(K fromKey, K toKey)
		// Returns a view of the portion of this map whose keys range from fromKey, 
		//inclusive, to toKey, exclusive.
		
		System.out.println("Submap from 0 to 2 key : " +treeMap.subMap(-1, 3));
		
	}

}
