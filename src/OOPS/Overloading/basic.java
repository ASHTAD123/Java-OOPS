package OOPS.Overloading;

class basic{
	
//	Overloading example
	public static void main(String[] args) {
		
		basic b = new basic();
		b.m1();
		b.m1(11);
		b.m1(11.5);
		b.m1(11.5f);
	}
	
	public void m1() {
		System.out.println("No arg method");
	}
	
	public void m1(int i) {
		System.out.println("int arg method");
	}
	public void m1(float d) {
		System.out.println("float arg method");
	}
	public void m1(double d) {
		System.out.println("double arg method");
	}
}