package class_10_03_Collections_02;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {

		// Collections that stores unique values ONLY
		// Linked HashSet keeps the values in insertion order

		// Declaring Linked HashSet Object:
		LinkedHashSet<String> names = new LinkedHashSet<>();
		names.add("Husam");
		names.add("Noora");
		names.add("Aws");
		names.add("Deema");
		System.out.println(names);
		
		// TreeSet sorts the elements in ascending order by default
		// Allow unique values only 
		// Slow performance
		TreeSet <Integer> nums = new TreeSet<>(); 
		nums.add(77); 
		nums.add(31); 
		nums.add(55); 
		nums.add(16); 
		System.out.println(nums);
		
		Iterator<Integer> it = nums.iterator(); 
		 while (it.hasNext()) {
			 System.out.println(it.next());
		 }

	}

}
