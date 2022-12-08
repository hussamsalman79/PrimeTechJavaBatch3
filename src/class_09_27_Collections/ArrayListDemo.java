package class_09_27_Collections;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList <String>list = new ArrayList<String>(); 
		list.add("Hello"); 
		list.add("Sam Karmah");
		list.add("Java");
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
		for (String item : list) {
			System.out.println(item);
		}
	}

}
