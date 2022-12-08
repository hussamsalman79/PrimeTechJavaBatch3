package class_10_03_Collections_02;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>(); 
		nums.add(5); 
		nums.add(2); 
		nums.add(2); 
		nums.add(3); 
		nums.add(3);
		nums.add(1);
		System.out.println(nums);
		
		TreeSet <Integer> numsList = new TreeSet<>(nums); 
		System.out.println(numsList);
		
		
		
	}

}
