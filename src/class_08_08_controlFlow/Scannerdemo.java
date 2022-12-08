package class_08_08_controlFlow;

import java.util.Scanner;

public class Scannerdemo {
	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);
		// will read the integer value from the console
		int age = myscanner.nextInt();
		System.out.println("My age is = " + age);
		String name = myscanner.next();
		System.out.println("My Name is = " + name);
	}
}
