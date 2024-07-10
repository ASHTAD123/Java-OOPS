package Concepts.Collection.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_Interface_methods {

	
	//Performing all List methods
	
	public static <T> void main(String[] args) {
	
	//Array List of Strings
	List<String> list = new ArrayList<String>();
	list.add("Ashtad");
	list.add("Deduu");
	list.add("Piyuu");
	printMyList(list);
	
	System.out.println();
	System.out.println("Size of list :" +list.size());
	
	
	//Array List of Integers
	List<Integer> listOfNums = new ArrayList<Integer>();
	
	for(int i=0 ;i<=100 ; i++) {
		listOfNums.add(i);
	}
	printMyList(listOfNums);
	System.out.println();
	System.out.println("Size of list :" +listOfNums.size());
	
	
	
	//addAll()
	List newlist = new ArrayList();
	newlist.add("element-1");
	newlist.addAll(list);
	printMyList(newlist);
	
	//clear()
	//System.out.println("Clearing the above list");
	//newlist.clear();
	
	//contains
	System.out.println("Does it contain 'Ashtad' ? : " +newlist.contains("Ashtad"));
	System.out.println("Does it contain all elements from 1st list ? : " +newlist.contains(list));
	System.out.println();
	
	
	
	
	//equals()
	//	both list have same size & elements
	List newListCopy = new ArrayList();
	newListCopy.addAll(newlist);
	
	System.out.println("Old & new list are similar & equal in size ? : "+newlist.equals(newListCopy));
	System.out.println("Element at index 0: " +newListCopy.get(0));
	System.out.println("Element at index 4: "+newListCopy.get(3));
	
	System.out.println("is list empty ? : " + newListCopy.isEmpty());
	
	ListIterator newListCopyIterator = newListCopy.listIterator();
	
	System.out.println("Traversing elements using List Iterator");
	//Traversing using iterator
	while(newListCopyIterator.hasNext()) {
		System.out.println(newListCopyIterator.next());
	}

	System.out.println("Element at index 0: " +newListCopy.get(0));
	System.out.println("Element at index 0: " +newListCopy.get(1));
	
	
	//remove()
//	System.out.println("Removing element no 2:" +newListCopy.remove(2));
//	System.out.println("Removing element 'Ashtad:'" +newListCopy.remove(1));
	
//	UnaryOperator<T> unaryPlus = UnaryOperator.;
	
	
	
	//replaceAll(UnaryOperator<E> operator)
	List numList = new ArrayList();
	for(int i=0 ; i<=10 ; i++) {
		numList.add(i);
	//	numList.replaceAll(1*1);
	}
	
	ListIterator numListIterator = numList.listIterator();
	while(numListIterator.hasNext()) {
		System.out.println(numListIterator.next());
	}
	
	numList.add(1);	
	numList.add(11);	
	numList.add(12);
	numList.add(23);
	
	//remove()
	numList.remove(1);
	numList.set(4, 23);
	System.out.println(Arrays.toString(numList.toArray()));
	
	//subList
	System.out.println(Arrays.toString(numList.subList(1, 3).toArray()));	
	
	
}

	
	
	
	public static <T> List<T> printMyList(List listArg){
		
		Iterator<T> list = listArg.iterator();
		System.out.println();
		while(list.hasNext()) {
			System.out.print(list.next());
			System.out.print(",");
		}	
		System.out.println();
		return listArg; 
	}
}
