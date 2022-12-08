package class_09_12;

import java.util.Arrays;

public class Arrays_methods {
	
	public static void main(String[] args) {
		
//		int[] nums = {3,12,56,31,123,33,66,77,88,1234,544,2234,54654,234,2,9,8,7};
//		
//		// 1- Convert an array to String format: using Arrays.toString(name of the array)
//		// We can use this method with primitive data types only. We cannot use it with objects. 
//		System.out.println(Arrays.toString(nums));
//		
//		//2- Sorting elements in the Array: using Arrays.sort(name of the array)
//		Arrays.sort(nums);
//		System.out.println("--------After Sorting ---------");
//		System.out.println(Arrays.toString(nums));
//		
//		//3- Binary Search: Array has to be sorted first. 
//		// using Arrays.binarySearch(name, index);
//		// find 88
//		
//		 int index = Arrays.binarySearch(nums, 88); 
//		System.out.println(index);
//		
		String[] words = {"Hellow", "Love", "David", "Morning", "java", "bird"};
		
		Arrays.sort(words);
		System.out.println(Arrays.toString (words));
		
		int word = Arrays.binarySearch(words, "java"); 
		
		if (word>=0) {
			System.out.println("Java found: " + word);
		}
		else {
			System.out.println("Java not found");
		}

		// 4- Arrays.copy(): Copy entire array to a new array
		String  [] copyWords = new String[3]; // Creating new array
		copyWords = Arrays.copyOf(words, 3); // apply copyOf method 
		System.out.println(Arrays.toString(copyWords)); // print using Arrays.toString ()
		
		int[] nums = {2,55,3,2,5};
		int [] copyNums = new int [2]; 
		copyNums = Arrays.copyOf(nums, 2); 
		System.out.println(Arrays.toString(copyNums));
		
		//5- Arrays.equals(): Using to compare Arrays 
		
		int[] nums1 = {2,55,3,2,5};
		System.out.println(nums==nums1); //== comparing the reference not the actual elements 
		
		System.out.println(Arrays.equals(nums, nums1)); //Compare the the actual values inside the arrays
		
		
	}

}
