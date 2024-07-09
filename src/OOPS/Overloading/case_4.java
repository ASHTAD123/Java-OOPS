package OOPS.Overloading;

public class case_4 {
	
	public void m1(int i) {
		System.out.println("General method");
	}
	public void m1(int...i) {
		System.out.println("Var arg method");
	}
	public static void main(String[] args) {
		
		case_4 c4 = new case_4();
		c4.m1();//var arg method because it can accept 0 or more
		c4.m1(10,20);//var arg method
		c4.m1(5);//general method ,cuz var-arg is new concept,in Java old is gold
		
		
	}
}
