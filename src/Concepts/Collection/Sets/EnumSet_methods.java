package Concepts.Collection.Sets;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

public class EnumSet_methods {

	enum FRIENDS {
		ASHTAD, ALLAN, ROSHAN, GAURAV, RYAN
	};

	enum languages {
		C, JAVA, PYTHON
	};

	enum languages1 {
		CSharp, PHP, JAVASCRIPT
	};

	public static void main(String[] args) {

		// public static <E> EnumSet<E> allOf(Class<E> elementType)
		
		EnumSet<FRIENDS> friends = EnumSet.allOf(FRIENDS.class);
		System.out.println("EnumSet : " + friends);

		EnumSet languages = EnumSet.allOf(languages.class);

		
		
		// public static <E extends Enum<E>> EnumSet<E> noneOf(Class<E> elementType)
		EnumSet languages0 = EnumSet.noneOf(languages.class);
		languages0.addAll(languages); // addAll()
		System.out.println(languages0);

		
		
		
		EnumSet languages2 = EnumSet.allOf(languages1.class);

		// iterator()
		Iterator<languages1> iterator = languages2.iterator();

		while (iterator.hasNext()) {
			System.out.print(iterator.next());
			System.out.print(", ");
		}

		System.out.println();

		
		
		// r̥emove()
		boolean v = languages2.remove(languages1.PHP);
		System.out.println();
		System.out.println("Removed element : PHP " + languages2);
		System.out.println(languages2);

		
		
		// public EnumSet<E> clone()
		EnumSet<languages> clone = languages.clone();

		Iterator i = clone.iterator();

		System.out.println();
		System.out.println("Printing clone : ");

		while (i.hasNext()) {
			System.out.print(i.next() + ",");
		}

		
		
		// public static <E extends Enum<E>> EnumSet<E> complementOf(EnumSet<E> s)
		enum names {
			friend1, friend2, friend3, friend4
		}
		;

		EnumSet<names> namesEnumSet = EnumSet.of(names.friend1);
		System.out.println("Initial set : " + namesEnumSet);

		System.out.println();
		// here is the compliment
		EnumSet<names> namesComplEnumSet = EnumSet.complementOf(namesEnumSet);
		System.out.println("Compliment set :");
		System.out.println(namesComplEnumSet);

		
		
		
		// public static <E extends Enum<E>> EnumSet<E> copyOf(Collection<E> c)
		Collection c = new ArrayList();
		c.add(FRIENDS.ASHTAD);
		EnumSet e = EnumSet.copyOf(c);
		System.out.println("Copied values in enumSet using collection : " + e);

		
		
		
		//public static <E extends Enum<E>> EnumSet<E> of(E e)
		enum abc {
			A, B, C, D, E
		};
		
		EnumSet<abc> eSet = EnumSet.of(abc.A);
		EnumSet<abc> eSet1 = EnumSet.of(abc.A,abc.B);
		EnumSet<abc> eSet2 = EnumSet.of(abc.A,abc.B,abc.C);
		
		
		// public static <E extends Enum<E>> EnumSet<E> of(E first,E... rest)
//		eSet2 = EnumSet.of(abc.D);
		
		eSet = EnumSet.range(abc.A,abc.C);
		
		//range
		System.out.println(eSet);
	
		
		
	}
}
