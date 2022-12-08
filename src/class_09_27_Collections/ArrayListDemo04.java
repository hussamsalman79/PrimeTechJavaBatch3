package class_09_27_Collections;

import java.util.ArrayList;

public class ArrayListDemo04 {
	public static void main(String[] args) {
		
		ArrayList <String> names = new ArrayList<>(); 
		
		names.add("Husam"); 
		names.add("Noora"); 
		names.add("Aws"); 
		names.add("Deema"); 
		names.add("Basma"); 
		System.out.println(names);
		names.remove("Basma"); // we can remove as string or as index number
		System.out.println(names);
		int index = names.indexOf("Deema"); // return the index of an element
		System.out.println("Index of Deema is: " + index);
		names.set(0,"Sam"); // Replace an element based on index number
		System.out.println(names);
		//names.size() ==> will return the size of the array
		System.out.println("The size of the array is: " + names.size());
		System.out.println(names.contains("Sam"));// will return the true/false 
		names.clear();// will clear the elements from the array list 
		System.out.println(names);
		
		
		
	}

}
