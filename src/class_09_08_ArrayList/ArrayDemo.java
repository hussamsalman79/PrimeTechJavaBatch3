package class_09_08_ArrayList;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {

		// For Loop for Arrays

		int[] numbers = { 1979, 1982, 2010, 2016 };

		System.out.println(numbers.length);

		System.out.println("-------------------");

		for (int i = 0; i < numbers.length; i++) {

			if (i == 0) {
				System.out.println("Father DOB:" + numbers[0]);
			} else if (i == 1) {
				System.out.println("Mother DOB:" + numbers[1]);
			} else if (i == 2) {
				System.out.println("Son DOB:" + numbers[2]);
			} else {
				System.out.println("Daughter DOB:" + numbers[3]);
			}

		}

	}

}
