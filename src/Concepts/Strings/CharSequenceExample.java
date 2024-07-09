package Concepts.Strings;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Arrays;

public class CharSequenceExample {


	public static void main(String[] args) throws IOException {
		
			char ca[] = {'a','s','h','t','a','d'};
			CharBuffer cb = CharBuffer.wrap(ca);
			
			System.out.println("----------Buffer 1-----------");
			System.out.println("Wrapped charater array into character buffer & priting those elements :" +Arrays.toString(cb.array()));
			System.out.println("Char array length :" +ca.length);
			System.out.println("Char buffer length : " +cb.length());
			System.out.println("Current pos: "+cb.position());
			
			//System.out.println("Setting current position of Buffer 1 to : " +cb.position(6));
			//System.out.println("New Current pos: "+cb.position());
			
			
			System.out.println("");
			
			System.out.println("----------Buffer 2-----------");
			CharBuffer cb1 = CharBuffer.allocate(20);
			cb1.put('i');
			cb1.put('r');
			cb1.put('a');
			cb1.put('n');
			cb1.put('i');
			System.out.println(Arrays.toString(cb1.array()));
			System.out.println("Current pos "+cb1.position());
			System.out.println("Default Slicing from curr pos " + cb1.position());
			
			//Slicing
			CharBuffer cb3 =CharBuffer.allocate(20);
			cb3 = cb.slice();
			System.out.println(Arrays.toString(cb3.array()));
			
			
			
			
			
			//System.out.println("Char buffer length after slicing : " +cb1.length());

//			cb1.position(0);//setting position
//			cb1.mark();//marking position
//    		cb1.reset();//resetting position
			//System.out.println("Current pos after resetting: "+cb1.position());
			//System.out.println(Arrays.toString(cb1.array()));
			
	}

}
