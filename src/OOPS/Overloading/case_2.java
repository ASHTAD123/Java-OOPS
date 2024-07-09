package OOPS.Overloading;

public class case_2 {

	
	public void m1(Object o1) {
		System.out.println("Object version");
	}
	public void m1(String s1) {
		System.out.println("String version");
	}
	
	public static void main(String[] args) {
		
		case_2 obj2 = new case_2();
		obj2.m1(new Object());//Object version
		obj2.m1("Ashtad");//String version
		obj2.m1(null);//String version because child() will get chance
	}

}
