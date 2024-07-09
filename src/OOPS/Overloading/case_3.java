package OOPS.Overloading;

public class case_3 {
	
	
	public void m1(String s) {
		System.out.println("String version");
	}
	
	public void m1(StringBuffer s) {
		System.out.println("String Buffer version");
	}
	

	public static void main(String[] args) {
		
		case_3  c3 = new case_3();
		c3.m1("ash");
		c3.m1(new StringBuffer("ash"));
		//c3.m1(null);//because both are child classes of Object
		
	}
}
