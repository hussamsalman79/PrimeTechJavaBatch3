package class_09_27_Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo06_collectionClass_numbers {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>(); 
		// Sorting using collections method  
		numbers.add(3); 
		numbers.add(1); 
		numbers.add(2); 
		numbers.add(4); 
		numbers.add(6); 
		numbers.add(5); 
		System.out.println(numbers);
		Collections.sort(numbers);// sorting in ascending order
		System.out.println(numbers);
		numbers.sort(Collections.reverseOrder());// sorting in descending order
		System.out.println(numbers);
	}

}
