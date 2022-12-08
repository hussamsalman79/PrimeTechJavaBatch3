package Replit_HomeWork;

public class Java_Array_HW01 {
	
	public static void main(String[] args) {	
		/*
	     * Homework 1:
	     * 1. Create an int array with size of 5
	     * 2. Add 5 random numbers into your array 
	     * using index
	     * 3. Print out the member of the array using 
	      index
	     */
		
		int [] numbers = new int [5]; 
		
		numbers [0] = 23; 
		numbers [1] = 55; 
		numbers [2] = 11; 
		numbers [3] = 98; 
		numbers [4] = 76; 
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		
		/*
	     * Homework 2:
	     * 1. Create and initialize a String array 
	     * with 3  names in it using {}
	     * 2. Print out the member of the array using 
	     * index
	     */
		
		String [] names = {"Dilan", "Matt", "Jack"}; 
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
	
		
		
		
	}

}
