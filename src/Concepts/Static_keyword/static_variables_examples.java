package Concepts.Static_keyword;

public class static_variables_examples {

	
	static String name="Ashtad";

	public static void main(String[] args) {
		
		static_variables_examples exmpl_1 = new static_variables_examples();
		System.out.println("Object exmpl_1 : " +exmpl_1.name);//can access using object also but not recommended
		
		//Accessing using class name ,correct way
		System.out.println(static_variables_examples.name);
		
		static_variables_examples exmpl_2 = new static_variables_examples();
		System.out.println("Object exmpl_2 : " +exmpl_1.name); //name remains same
		
		System.out.println();
		
		
		static_variables_examples exmp2 = new static_variables_examples();
		System.out.println("Now changing value of static variable");
		exmp2.name = "Ashu";
		
		
		System.out.println(" Value from Exmp2 object : "+ exmpl_2.name);
		System.out.println(" Value from Exmp1 object : "+ exmpl_1.name);
		System.out.println(" Value when access from class name : " + static_variables_examples.name);
	}

}
