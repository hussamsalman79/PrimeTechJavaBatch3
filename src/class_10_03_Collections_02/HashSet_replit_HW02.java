package class_10_03_Collections_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class HashSet_replit_HW02 {

	public static <T> void main(String[] args) {
		/*
		 * HomeWork2: HashSet ==> Create HashSet of Integer ==> Add 5 random Integer ==>
		 * remove element on index 0 and 1 ==> sort the elements in ascending orders ==>
		 * sort the element in desending order ==> use iterator to loop through the
		 * n
		 * loop through the HashSet ==> Convert the ArrayList to LinkedList ==> convert
		 * the ArrayList to Array
		 */

		HashSet<Integer> numbers1 = new HashSet<>();
		numbers1.add(15);
		numbers1.add(33);
		numbers1.add(77);
		numbers1.add(23);
		numbers1.add(64);
		numbers1.remove(0); 
		numbers1.remove(1); 
		System.out.println(numbers1);

		ArrayList<Integer> NumsList = new ArrayList<>(numbers1);
		System.out.println(NumsList);
		Collections.sort(NumsList);
		System.out.println("Sorting elements in ascending order: " + NumsList);
		Collections.sort(NumsList, Collections.reverseOrder());
		System.out.println("Sorting elements in Descending order: " + NumsList);
		System.out.println("-------Iterator---------");
		Iterator<Integer> it = numbers1.iterator();
		while (it.hasNext()) {
		System.out.println(it.next());
		}
		System.out.println("------For Loop---------");
		for (int i = 0; i < NumsList.size(); i++) {
		System.out.println(NumsList.get(i));
		}
		System.out.println("-------For Each Loop--------");
		for (Integer nums : numbers1) {
		System.out.println(nums);
		}
		LinkedList<Integer> NumsList01 = new LinkedList<>(NumsList); 
		System.out.println(NumsList01);
		
		Object [] arr = numbers1.toArray(); 
		for (int n=0; n<arr.length; n++) {
			System.out.println(arr[n]);
		}
	}

}
