package class_10_10_Collections_Map;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer, String> students3 = new TreeMap<Integer, String>(); 
		
		students3.put(1, "Sam"); 
		students3.put(2, "Marwan"); 
		students3.put(5, "Omar"); 
		students3.put(3, "Saif"); 
		students3.put(4, "Ammar");
		
		System.out.println(students3);
		

	}

}
