package Replit_HomeWork;

import java.util.Arrays;

public class Java_Array_HW02 {
	
	public static void main(String[] args) {	
		/*
	     * Task 1:
	     * => Create and Integer Array with size
	     * of 5
	     * => Add 5 Random number to the array using
	     * index
	     * => Use for loop to print out all the array
	     * Element
	     * => Sort the array in ascending order
	     * => use for each loop to print out all the
	     * array member after sorting
	     * 
	     * => Convert Array to String and print
	     * the string arrays
	     */
		
		
		int [] nums = {34, 22, 98, 11, 77}; 
		
		for (int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println("--------------------");
		
		Arrays.sort(nums);
		for (int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		System.out.println(Arrays.toString(nums)); 
		
		
		
	}

}
