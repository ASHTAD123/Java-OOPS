package Concepts.Collection.Lists;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Vector;
import java.util.function.Predicate;

public class Vector_methods {

	public static void main(String[] args) {

		// Ensures that this collection contains the specified element (optional
		// operation).
		// Returns true if this collection changed as a result of the call.
		// (Returns false if this collection does not permit duplicates and
		// already contains the specified element.)
		Vector vector1 = new Vector();

		
		// add()
		vector1.add("a");
		vector1.add(1);
		vector1.add(2);
		vector1.add(3);
		vector1.add(4);
		boolean a = vector1.add(5);

		System.out.println(a);
		System.out.println("Vector 1 : " + vector1);

		
		// add(int index, E element)
		vector1.add(0, "dhedhan");
		System.out.println(vector1);

		
		// addAll(int index, Collection<? extends E> c)
		//This method is of Vector class & not from collection
		Vector v1 = new Vector();
		v1.add(0, "ash");
		v1.addAll(0, vector1);

		System.out.println("Default initial capacity : " + v1.capacity());

		
		// forEach(Consumer<? super E> action)
		// performs specified operation on all elements
		v1.forEach((a1) -> System.out.println(a1 + " added"));

		
		
		// removeIf(Predicate<? super E> filter)
		Predicate condition = v -> v1.contains(1);
		// v1.removeIf(condition);
		System.out.println(v1);

		// insertElementAt(E obj, int index)
		v1.insertElementAt("0", 0);
		System.out.println(v1);

		// public void copyInto(Object[] anArray)
		Object[] intArr = new Object[10];
		v1.copyInto(intArr);
		System.out.println("Array : " + Arrays.toString(intArr));

		// public void setSize(int newSize)
		Vector v2 = new Vector(10);
		v2.add("1");
		v2.add("2");
		v2.add("3");
		v2.add("4");
		v2.add("5");
		v2.add("6");
		v2.setSize(5);
		System.out.println(v2); // other elements are discarded

		// public Enumeration<E> elements()
		Enumeration e = v2.elements();
		System.out.println("Enumeration from vector object");
		while (e.hasMoreElements()) {
			System.out.print(e.nextElement());

		}
		System.out.println();
		
		
	}
}
