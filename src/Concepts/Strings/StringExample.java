package Concepts.Strings;

public class StringExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String a=";";
		a="d";
		System.out.println(a);
	
		StringBuffer buffer = new StringBuffer();
		buffer.append("Hello");
		buffer.append(".....");
		buffer.append("Ashuuuu");
		
		System.out.println(buffer);
	
		//Creating a String from character array
		char[] ch = {'A','S','H','T','A','D'};
		String s = new String(ch);
		
		System.out.println(s);
		
		int startIndex =1;
		int endIndex=3;
		
		//same as sub string
		String s1 = new String(ch,startIndex,endIndex);
		System.out.println(s1);
	
	
		//Returns susbtring from ith character to end
		String s2 ="abcs";
		System.out.println("Substring:"+s2.substring(2));
	
		//Returns susbtring from start to end-1
		String s3 ="ameena";
		System.out.println("Substring:"+s3.substring(1,s3.length()));
	
		//String contact
		System.out.println(".......String concat.....");
		String f="abcd";
		String b="efgh";
		System.out.println("String a" +f);
		System.out.println("String b" +b);
		String concat =f.concat(b);
		System.out.println("Concat a+b :"  +concat);
		
		//indexOf()
		//returns index within string of 1st occ of specified string
		String z ="hello good morning";
		System.out.println("Index :" +z.indexOf("good"));
		
		//equals
		String one ="a";
		String two ="b";
		System.out.println(one.equals(two));
		
		
		//compareTo()
		/*
		 * diff < 0  // s1 comes before s2
 		   diff = 0  // s1 and s2 are equal.
 		   diff > 0   // s1 comes after s2.
		 * */
		String ab="Abcd";
		String bc="defgh";
		int diff=ab.compareTo(bc);
		System.out.println(diff);
		
		if(diff<0) {
			System.out.println("String ab come lexographically first");
		}else if(diff>0) {
			System.out.println("String bc come lexographically first");
		}else 
			System.out.println("Both are equal lexographically");
		
		//lowercase
		String as="ASJASDSUD";
		System.out.println(as.toLowerCase());
		
		//uppercase
		String as1="asasasas";
		System.out.println(as1.toUpperCase());
		
		//trim[removes white-space]
		String trimIt="  aaaaaaaa sssss  ss  s    s  s ss ";
		System.out.println(trimIt.trim());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
