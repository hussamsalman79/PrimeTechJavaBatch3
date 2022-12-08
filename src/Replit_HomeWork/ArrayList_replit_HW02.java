package Replit_HomeWork;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_replit_HW02 {
	public static void main(String[] args) {
		/*
	     * ==> Create one Integer ArrayList
	     * ==> Add 5 random numbers to it
	     * ==> write a for loop to calculate the sum of all
	     * all numbers in the ArrayList
	     * 
	     */
		int sum = 0; 
		ArrayList <Integer> nums = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50)); 
		
		for (int i=0; i<nums.size(); i++) {
			
			sum = sum + nums.get(i);	
		}
		System.out.println("The Sum of all number in the array is: " + sum);
		
		
		
		
		
		
	}
}
