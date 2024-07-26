package Concepts.Collection.Maps;

import java.util.EnumMap;

public class EnumMap_methods {

	
	public static void main(String[] args) {
		
		enum Days {
			 MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY ;
		}
		
		
		//Inserting mappings
		EnumMap<Days,String> daysMap = new EnumMap<>(Days.class);
		
		daysMap.put(Days.MONDAY, "Work");
		daysMap.put(Days.TUESDAY, "Work");
		daysMap.put(Days.WEDNESDAY, "Work");
		daysMap.put(Days.THURSDAY, "Work");
		daysMap.put(Days.FRIDAY, "Work");
		daysMap.put(Days.SATURDAY, "Relax");
		daysMap.put(Days.SUNDAY, "Relax");
		System.out.println();
		
		
		
		//Retreiving elements
		System.out.println("Key :  " + Days.MONDAY);
		System.out.println("Value :" +daysMap.get(Days.MONDAY));
		System.out.println("Keys :" + daysMap.keySet());
		System.out.println();
		System.out.println("Values :" + daysMap.values());
		
		
		//Replace
		daysMap.replace(Days.SUNDAY, "Relax & Play");
		
		System.out.println();
		System.out.println("After replacing elements");
		System.out.println("Values :" + daysMap.values());
		
		System.out.println();
		System.out.println("Size of Map :" +daysMap.size());
		
	}
}
