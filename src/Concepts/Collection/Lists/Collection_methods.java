package Concepts.Collection.Lists;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

class Collection_methods{
	
	public static void main(String[] args) {
		
		/*
			Examples of Collection Interface Methods
		*/

		
		//add()		
		Collection<String> list = new LinkedList<String>();
		list.add("ABC");
		list.add("ABC-1");
		list.add("ABC-2");
		
		//addAll()
		Collection<String> list_1 = new LinkedList<String>();
		list_1.addAll(list);
		
		//contains()
		System.out.println("-----Contains()--------");
		System.out.println(list.contains("ABC"));
		System.out.println(list.contains("A"));
		System.out.println("-----------------------");
		
		//containsAll
		System.out.println(list.containsAll(list_1));
		
		//remove()
		System.out.println("Before removing : "+list_1.contains("ABC"));
		list_1.remove("ABCS");
		System.out.println("After removing : "+list_1.contains("ABCS"));
		
		
		System.out.println("-----retains()--------");
		Collection<String> newlist = new LinkedList<String>();
		newlist.add("ABC-1");
		
		//retaining elements specified in collection & removes rest
		list.retainAll(newlist);
		
		//adding the retained Collection object into new collection
		Collection<String> afterRetain = new LinkedList<String>();
		afterRetain.addAll(list);
		
		//Iterator
		Iterator<String> it = afterRetain.iterator();
		
		//Printing the retained elements
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//size of the collection
		System.out.println("Size of Collection : " +list.size());
		
		
		
		Object[] collToArr = list.toArray();
		System.out.println("Priting array values which was converted from Collection ");
		for(Object e : collToArr) {
			System.out.println(e);
		}
	}

}