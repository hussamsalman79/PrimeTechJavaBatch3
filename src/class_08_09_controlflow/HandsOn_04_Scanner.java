package class_08_09_controlflow;

import java.util.Scanner;

public class HandsOn_04_Scanner {
	public static void main(String[] args) {

		Scanner myscan = new Scanner(System.in);
		System.out.println("Are you a student? Please enter yes or No");
		String student = myscan.next();

		switch (student) {
		case ("yes"):
			System.out.println("Welcome to our Java Class");
			break;
			default:
			System.out.println("Please register to our Class");
		}
	}
}
