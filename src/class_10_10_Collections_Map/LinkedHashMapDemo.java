package class_10_10_Collections_Map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		// Will keep the order based on insertion order
		LinkedHashMap<Integer, String> students3 = new LinkedHashMap<Integer, String>(); 
		students3.put(1, "Sam"); 
		students3.put(2, "Marwan"); 
		students3.put(5, "Omar"); 
		students3.put(3, "Saif"); 
		students3.put(4, "Ammar");
		// print the entries in insertion order
		System.out.println(students3);
	}

}
