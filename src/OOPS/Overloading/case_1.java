package OOPS.Overloading;

/* *****************************
 * Automatic Promotion example *
 * *****************************/

/*
 * byte >> short >> int >> long >> float >> double
 * char>> int
 */
public class case_1 {

	public static void main(String[] args) {
		
		case_1 b = new case_1();
		/*
		 * here exact match is not available , compiler wont raise error immediately
		 	so here char >> int promotion is happening
		 */
		b.m1('a'); 
		b.m1(112l); //long>>float promotion
		//b.m1(121.23);//error because no promotion possible
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
	
	
}
