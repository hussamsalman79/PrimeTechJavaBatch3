package class_10_03_Collections_02;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayList_replit_HW01 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>(); 
		numbers.add(77); 
		numbers.add(44); 
		numbers.add(91); 
		numbers.add(13); 
		numbers.add(35); 
		System.out.println(numbers);
		
		numbers.remove(0); 
		numbers.remove(1); 
		System.out.println("After removing index 0 and index 1: " + numbers);
		numbers.sort(null);
		System.out.println("After sorting in ascending order: " + numbers);
		Collections.sort(numbers, Collections.reverseOrder());
		System.out.println("After Reverse Order: " + numbers);
		System.out.println("-------Iterator---------");
		Iterator <Integer> it = numbers.iterator(); 
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("------For Loop---------");
		for (int i=0; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		System.out.println("-------For Each Loop--------");
		 for (Integer nums:numbers) {
			 System.out.println(nums);
		 }
		 System.out.println("-----HashSet--------");
		 HashSet<Integer> numSet = new HashSet<>(numbers);
		 System.out.println(numSet);
		 
		 System.out.println("-----Array--------");
		 
		 Object [] arr = numbers.toArray(); 
		 System.out.println(arr[0]);
		 System.out.println(arr[1]);
		 System.out.println(arr[2]);
 	}

}
