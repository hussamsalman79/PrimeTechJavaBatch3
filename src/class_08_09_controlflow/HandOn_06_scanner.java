package class_08_09_controlflow;

import java.util.Scanner;

public class HandOn_06_scanner {
	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		System.out.print("Please Enter your first name: ");
		String name1 = myScan.next();
		System.out.print("Please enter your last name: ");
		String name2 = myScan.next();

		System.out.println("Full Name is: " + name1 + " " + name2);
	}
}
