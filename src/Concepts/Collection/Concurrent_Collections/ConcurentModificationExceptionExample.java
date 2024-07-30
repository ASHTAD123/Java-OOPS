package Concepts.Collection.Concurrent_Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurentModificationExceptionExample extends Thread {

	
	//----------------------- PENDING ---------------------
	static ArrayList al = new ArrayList();
	
	public void run() {
		
		try {
			 Thread.sleep(50);
			 }
			catch(InterruptedException ie) {
			System.out.println("Child Thread is Updating List");
			al.add("D");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		al.add("A");
		al.add("B");
		al.add("C");
		
		ConcurentModificationExceptionExample myThread = new ConcurentModificationExceptionExample();
		myThread.start();
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext()) {
			
			String s1 = (String)itr.next();
			System.out.println("Main Thread Iterating List & current object is : " +s1);
			Thread.sleep(24);
		}
	
	
	System.out.println(al);
	
	}
}
