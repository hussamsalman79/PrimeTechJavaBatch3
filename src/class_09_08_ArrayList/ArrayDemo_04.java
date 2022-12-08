package class_09_08_ArrayList;

import java.util.Arrays;

public class ArrayDemo_04 {
	public static void main(String[] args) {

		int[] numbers = { 3, 5, 4, 1 };

		int[] filterArray = new int[numbers.length];
		
		for (int i =0; i<numbers.length; i++) {
			filterArray[i] = numbers[i];
		}
		System.out.println(Arrays.toString(filterArray));
	}
}