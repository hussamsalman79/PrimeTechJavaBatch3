package class_09_27_Collections;

import java.util.ArrayList;

public class ArrayListDemo_02 {
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(); 
		numbers.add(55); 
		System.out.println(numbers);
		numbers.add(2); 
		System.out.println(numbers);
		numbers.add(7); 
		System.out.println(numbers);
		numbers.add(1, 66); // INSERT AN ELEMENT TO THE ARRAY 
		System.out.println(numbers);
		numbers.remove(1); 
		System.out.println(numbers);
		
		
	}

}
