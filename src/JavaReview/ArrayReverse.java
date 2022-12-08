package JavaReview;

import java.util.Arrays;

public class ArrayReverse {
		
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		int[] reversedNumbers = reverseArray(numbers);
		System.out.println(Arrays.toString(reversedNumbers));
	}
	
	public static int[] reverseArray(int[] arr) {
		
		int[] reversedArray = new int[arr.length];
		int index =0;
		for(int i = arr.length-1; i>=0 ;i--) {
			reversedArray[index] = arr[i];
			index++;
		}
		return  reversedArray;
	}
}