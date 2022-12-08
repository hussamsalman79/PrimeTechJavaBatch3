package class_10_03_Collections_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		
		// Syntax of HashSet
		
		HashSet <String> jobs = new HashSet<>(); 
		jobs.add("Engineer"); 
		jobs.add("Nurse"); 
		jobs.add("Mechanic"); 
		jobs.add("Teacher"); 
		jobs.add("Teacher"); 	// HashSet will not allow duplicate values 
		jobs.add(null);
		System.out.println(jobs);// print with random order as it does not have index
//		Collections.synchronizedSet(jobs); 
		Iterator <String> it = jobs.iterator(); // Iterator method
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		// Converting HashSet to an ArrayList 
		// Passing HashSet to the arraylist constructor
		ArrayList<String> jobsList = new ArrayList<>(jobs); 
		System.out.println("Index 1: " + jobsList.get(1));
		System.out.println("Index 2: " + jobsList.get(2));
		
		
		// Accessing elements using for:each loop
		for (String job:jobs) {
			System.out.println(job);
		}
		
		// Converting HashSet to java array: 
		Object [] arr = jobs.toArray(); 
		System.out.println("The index of 3: " + arr[3]);
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
	
		
		
	}

}
