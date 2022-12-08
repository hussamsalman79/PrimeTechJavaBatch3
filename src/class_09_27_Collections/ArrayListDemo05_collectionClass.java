package class_09_27_Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo05_collectionClass {

	public static void main(String[] args) {
ArrayList <String> names = new ArrayList<>(); 
		
		names.add("Husam"); 
		names.add("Noora"); 
		names.add("Aws"); 
		names.add("Deema"); 
		names.add("Basma"); 

		Collections.sort(names); 
		System.out.println("After sorting in acsending order: " + names);
		
		names.sort(Collections.reverseOrder());
		//Collections.sort(names, Collections.reverseOrder()); 
		System.out.println("After sorting in decsending order: " + names);
		
		
	}

}
