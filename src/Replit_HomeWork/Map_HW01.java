package Replit_HomeWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_HW01 {
	public static void main(String[] args) {
		 /*
	     * Home Work 1:
	     * Create a students data structure to store
	     * below key
	     * value pairs:
	     * 1="Muneer"
	     * 2="Mutlu"
	     * 3="Jay"
	     * 4="Musa"
	     * 
	     * ==> 
	     * ==>
	     * ==> print out all the key value pairs
	     * using for each loop
	     * ==> print out all the key value pairs
	     * using Iterator
	     */
		//Create a students data structure to store
		HashMap <Integer, String> Students = new HashMap<>(); 
		Students.put(1,"Muneer");
		Students.put(2,"Mutlu");
		Students.put(3,"Jay");
		Students.put(4,"Musa");
		System.out.println(Students);
		//Remove the Key value pairs with Key = 4
		Students.remove(4);
		System.out.println(Students);
		//print out the size of the data
		System.out.println(Students.size());
		//print the value of Key value pair that has a key of 3
		System.out.println(Students.get(3));
		//print out all the key value pairs using for each loop
		System.out.println("------For Loop------");
		for (int i=1; i<=Students.size(); i++) {
			System.out.println(Students.get(i));
		}
		//print out all the key value pairs using Iterator
		System.out.println("------Iterator Loop------");
		Set<Entry<Integer, String>> ent = Students.entrySet(); 
		Iterator <Entry<Integer,String>> itr = ent.iterator(); 
		while(itr.hasNext()) {
			Entry<Integer, String> entry = itr.next(); 
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
 		
		
		
	}

}
