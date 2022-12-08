package class_09_07_static_Arrays;

import java.util.Arrays;

public class Array_Demo01 {

	public static void main(String[] args) {

		// 1- Declaring an String array

		String[] days;
//
//		// 2- Initializing the array
//		// Size of the array must be provided
//		// This array can hold maximum of 7 strings
		days = new String[7];
//
//		// 3- Assigning values to the array's index
		days[0] = "Monday";
		days[1] = "Tuesday";
		days[2] = "Wednesday";
		days[3] = "Thursday";
		days[4] = "Friday";
		days[5] = "Saturday";
		days[6] = "Sunday";
//
//		// 4-printing the array
		System.out.println(Arrays.toString(days));
		System.out.println(days[2]);
		System.out.println(days[0]);

		int[] hours;
		hours = new int[6];
		hours[0] = 12;
		hours[1] = 13;
		hours[2] = 14;
		hours[3] = 15;
		hours[4] = 16;
		hours[5] = 17;
		System.out.println(Arrays.toString(hours));
	}

}
