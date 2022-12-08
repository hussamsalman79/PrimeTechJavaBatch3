package class_10_03_Collections_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SortingArrayList_replit_HW04 {

	public static void main(String[] args) {
		// Create ArrayList of Integer 
		ArrayList<Integer> myNums = new ArrayList<>(); 
		//add below integers to the ArrayList
		//11,2, 3,3,2,5,6,5
		myNums.add(11); 
		myNums.add(2); 
		myNums.add(3); 
		myNums.add(3); 
		myNums.add(2); 
		myNums.add(5); 
		myNums.add(6); 
		myNums.add(5); 
		System.out.println(myNums);
		
		//remove the duplication from the ArrayList
		HashSet<Integer> Numss = new HashSet<Integer>(myNums); 
		System.out.println("Remove Duplicate elements: " + Numss);
		
		//sort the ArrayList in descending order
		Collections.sort(myNums, Collections.reverseOrder());
		System.out.println("Descending Order: " + myNums);
		
		
	}
}
