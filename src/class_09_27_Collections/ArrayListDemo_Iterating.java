package class_09_27_Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo_Iterating {
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>(); 
		numbers.add(55);
		numbers.add(4);
		numbers.add(3);
		numbers.add(11);
		Iterator<Integer> it = numbers.iterator(); 
		System.out.println(it.hasNext()); // return true if there is element on next index
		System.out.println(it.next());// print 55 then move the cruiser to the next element
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		
	}

}
