package class_09_27_Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo02_Iterating {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>(); 
		numbers.add(55);
		numbers.add(4);
		numbers.add(3);
		numbers.add(11);
		Iterator<Integer> it = numbers.iterator(); 
		
		while (it.hasNext()) {
			int x = (Integer)it.next();
			if (x<10) {
				it.remove();
		}
		}
		System.out.println(numbers);

	}

}
