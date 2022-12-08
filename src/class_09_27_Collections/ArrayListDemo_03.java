package class_09_27_Collections;

import java.util.ArrayList;

public class ArrayListDemo_03 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>(); 
		numbers.add(55);
		numbers.add(4);
		numbers.add(3);
		numbers.add(11);

		for (Integer item : numbers) {
			System.out.println(item);
		}
		int sum =0;
		for (int i=0; i<=numbers.size()-1; ) {
			
			 sum = sum + numbers.get(i); 
			i++;
		}
		System.out.println("Sum is:" + sum);
		
		for (Integer i : numbers)
			 
            System.out.print(i + " ");
	}
	
}
