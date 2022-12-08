package class_09_27_Collections;

import java.util.LinkedList;

public class LinkListDemo {

	public static void main(String[] args) {
		
		LinkedList<Integer> nums = new LinkedList<>(); 
		nums.add(5); 
		nums.add(10); 
		nums.add(15); 
		nums.add(25); 
		nums.add(20); 
		System.out.println(nums);	
		nums.remove(); 
		System.out.println(nums);
		System.out.println(nums.getLast());
		System.out.println(nums.getFirst());
		
		

	}

}
