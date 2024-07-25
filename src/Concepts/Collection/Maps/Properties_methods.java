package Concepts.Collection.Maps;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Properties_methods {

	public static void main(String[] args) throws Exception {
	
		//Reading properties from created file
		FileReader reader = new FileReader("H:\\DSA\\Java_concepts\\src\\Concepts\\Collection\\Maps\\user_preferences.properties");
		
		Properties p = new Properties();
		p.load(reader);
		
		System.out.println("Reading from Properties file : ");
		System.out.println(p.getProperty("name"));
		System.out.println(p.getProperty("pass"));
		System.out.println();
		
		
		System.out.println("----- Priting System Properties ------");
		Properties sysProp = System.getProperties();
		Set propSet = sysProp.entrySet();
		
		Iterator iterator = propSet.iterator();
		while(iterator.hasNext()) {
			
			Map.Entry entry = (Map.Entry)iterator.next();
			 System.out.println(entry.getKey() + " = "
                     + entry.getValue()); 
		}
		
		System.out.println();
		
		
		
		//Creating & reading properties from created file
		System.out.println("Creating & reading properties from created file :");
		p.setProperty("username :", "ash");
		p.setProperty("password :", "000093");
		p.setProperty("email    :", "ash93@gmail.com");
		
		FileWriter fw = new FileWriter("user_info.properties");
		p.store(fw,"user properties file");
	
		//Reading written file
		FileReader reader1 = new FileReader("user_info.properties");
		p.load(reader1);
		
		//Storing values in a Set
		Set fileprop = p.entrySet();
		
		Iterator i = fileprop.iterator();
		
		while(i.hasNext()) {
			
			Map.Entry entry = (Map.Entry)i.next();
			System.out.println(entry.getKey() + " = "
                    + entry.getValue()); 
		}
	}

}
