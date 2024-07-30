package Concepts.Static_keyword;

public class static_block_example_1 {
	
	
	static String name="ASHTAD";
	
	static {
		 final String name1="ASHTAD-1";
		System.out.println(" Static block initialized ");
		System.out.println(" Static variable declared in class: " + name);
		System.out.println(" Static variable declared in static block: " + name1);
	}
	
	int num=10;
	public static void main(String[] args) {
		
		static_block_example_1 sb = new static_block_example_1();
		
		System.out.println();
		System.out.println("object 1 values : ");
		System.out.println(sb.num);
		System.out.println(sb.num);
		System.out.println(sb.num);
		System.out.println(sb.num);
		System.out.println();
		
		static_block_example_1 sb1 = new static_block_example_1();
		System.out.println("object 2 values : ");
		System.out.println(sb1.num);
		System.out.println(sb1.num);
		System.out.println(sb1.num);
		System.out.println(sb1.num);
		System.out.println();
		
		
		System.out.println("No matter how many objects we create ");
		System.out.println("Static block will be only called only once");
		
		
	}
	
	
}
