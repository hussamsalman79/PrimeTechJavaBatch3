package primetech.java.homepractice;

public class replit_Homework05 {

	/*
	 * Create a new char variable Create a switch statement testing for letters A,
	 * B, C, D and E Display the message “Found” if any of these are found and then
	 * break Add a default case to displays the message “Not found”.
	 */

	public static void main(String[] args) {

		char letter = 'E';

		switch (letter) {
		case 'A', 'B', 'C', 'D', 'E':
			System.out.println("Found it ");
			break;
		default:
			System.out.println("Not Found");
		}

	}

}
