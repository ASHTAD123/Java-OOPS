package Concepts.Collection.Sets;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSet_methods {

	 enum FRIENDS {ASHTAD,ALLAN,ROSHAN,GAURAV,RYAN};
	 enum languages {C,JAVA,PYTHON};
	 enum languages1{CSharp,PHP,JAVASCRIPT};
	 
	 
	 public static void main(String[] args) {
		
		 // public static <E extends Enum<E>> EnumSet<E> allOf(Class<E> elementType)
		 EnumSet<FRIENDS> friends = EnumSet.allOf(FRIENDS.class);	
		 System.out.println("EnumSet : " +friends);
		 
		 
		 EnumSet languages = EnumSet.allOf(languages.class);
		 
        // public static <E extends Enum<E>> EnumSet<E> noneOf(Class<E> elementType)     
		 EnumSet languages0 = EnumSet.noneOf(languages.class);
		 languages0.addAll(languages);	// addAll()
		 System.out.println(languages0);
		
		 
		 EnumSet languages2 = EnumSet.allOf(languages1.class);
		 
		 
		 //  iterator()
		 Iterator<languages1> iterator = languages2.iterator();
		 
		 while(iterator.hasNext()) {
			 System.out.print(iterator.next());
			 System.out.print(", "); 
		 }
		 
		 System.out.println();
		 //r̥emove()
		 boolean v = languages2.remove(languages1.PHP);
		 System.out.println("Removed element : PHP " + languages2);
		 System.out.println(languages2);
		 
	 
	 }
}
