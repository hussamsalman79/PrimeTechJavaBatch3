package class_09_12;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Demo {
	
	public static void main(String[] args) {

		// ArrayList: it is a class part of Java collection 
		// Just like am array, ArrayList can store multiple data of same type
		// ArrayList keep the elements in Insertion order (Keep adding )
		// ArrayList is not fixed size: size will increase as we add elements to it. 
		// Declare ArrayList 
		//	==> ArrayList<data type> name = new ArrayList<data type>(); 
		
		ArrayList<String> names = new ArrayList<String>(); 
		// Adding elements into ArrayList
		names.add("Noora"); 
		names.add("Aws"); 
		names.add("Deema"); 
		names.add("Husam"); 
		System.out.println(names);
		
		// Removing elements from ArrayList using Index or actual Value
		names.remove(3); 
		names.remove("Noora"); 
		System.out.println(names);
		
		// Clear out the ArrayList:
		//names.clear();
		//System.out.println(names);
		
		// Replace element on index with new value .set
		names.set(1, "DEDE"); 
		System.out.println(names);
		
		// size() method with return the size of the arrays 
		names.size();
		System.out.println(names.size());
		
		// TO access items into ArrayList at specific index
		
		names.get(0); 
		System.out.println(names.get(0));
	
		names.add("Noora"); 
		names.add("Husam"); 
		
		for (int i=0; i<names.size(); i++){
			System.out.println(names.get(i));
			
			for (String newNames : names) {
				
				System.out.println(newNames);
			}
		}
		
		
		// Wrapper Classes for primitive data types 
		//int : Integer 
		//boolean: Boolean
		// double: Double
		//long: Long 
		// char: Char
		//short: Short
		
		ArrayList<Integer> nums = new ArrayList<Integer>(); 
		nums.add(55); 
		nums.add(44); 
		System.out.println(nums);
		
	}

}
