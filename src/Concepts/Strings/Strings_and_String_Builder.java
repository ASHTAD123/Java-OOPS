package Concepts.Strings;

public class Strings_and_String_Builder {

	public static void main(String[] args) {
		
		String friend_one="Ashtad";
		String friend_two="Ashtad";

		String bestie_one = new String("Ashtad");
		String bestie_two = new String("Ashtad");
		
		
		//*********** == operator ******************//
		
		
		System.out.println("== equal operator examples");
		
		//results true because both variables refers to same object in heap
		System.out.println(friend_one==friend_two);

		//results false because both have same names but refer to different objects
		System.out.println(friend_one==bestie_one);
		
		
		
		System.out.println();
		//*********** .equals operator ******************//
		
		System.out.println(".equals operator examples");
		//results true because values are same , no matter the object ref
		System.out.println(friend_one.equals(bestie_one));

		System.out.println(friend_one.equals(friend_two));
		
		

		System.out.println();
		//*********** String Builder() ******************//
		StringBuilder strbuilder = new StringBuilder();
		strbuilder.append("ashtad");
		
		StringBuilder strbuilder1 = new StringBuilder();
		strbuilder1.append("ashtad");
		
		System.out.println(strbuilder==strbuilder1);
	}
}
