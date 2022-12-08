package Replit_HomeWork;

import java.util.Arrays;

public class Java_Array_HW02_task02 {

	public static void main(String[] args) {

		/*
		 * Task 2: ==> Given below String array
		 * 
		 * Verify weather the array has Name Alex ==> print: Alex is exist if found ==>
		 * print: Alex is not found if not found
		 * 
		 * ==>find out the index of the name Harry and print it ==> Copy only the first
		 * 3 element of the names array to a new Array
		 * 
		 */
		String[] names = { "David", "John", "Alex", "Harry", "James", "Hudson" };

		for (int i = 0; i < names.length; i++) {

			if (names[i].equals("Alex")) {

				System.out.println(names[i]);
			} else {
				System.out.println("Alex is not found");

			}

		}
		for (int n = 0; n < names.length; n++) {

			if (names[n].equals("Harry")) {

				System.out.println(names[n]);
			}
		}
		String[] copyNames = new String[3];

		for (int r = 0; r < copyNames.length; r++) {

			copyNames[r] = names[r];
		}
		System.out.println(Arrays.toString(copyNames));

	}

}
