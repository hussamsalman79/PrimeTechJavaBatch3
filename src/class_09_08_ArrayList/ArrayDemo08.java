package class_09_08_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDemo08 {

	public static void main(String[] args) {

		// Regular Array declare and initialize
		// You cannot add elements to a regular arrays
		// We cannot remove any element from a regular array
		String[] friends = { "Dilan", "Devon", "Matt", "Nick" };
		System.out.println(friends[0]);
		System.out.println(friends.length);
		// Set an element (change or modify elements)
		friends[1] = "Jack";  
		System.out.println(friends[1]);
		// We cannot remove any element from a regular array
		
		// To print a regular array, we need a for loop 	
		for (int i=0; i<friends.length; i++) {
			System.out.println(friends[i]);
		}

		System.out.println("===================");
		// Array list declare and initialize
		ArrayList<String> friendsList = 
				new ArrayList<>(Arrays.asList("Dilan", "Deveon", "Matt", "Nick"));
		// Get Array List size 
		System.out.println(friendsList.get(0)); 
		System.out.println(friendsList.size());
		
		// Adding elements to Array List 
		friendsList.add("Amber"); 
		System.out.println(friendsList.get(4)); 
		
		// Set an element 
		friendsList.set(1, "Jack"); 
		System.out.println(friendsList.get(1));
		
		// Remove an elements 
		friendsList.remove("Matt"); 
		 System.out.println(friendsList); // Matt has been removed 
		 
	}

}
