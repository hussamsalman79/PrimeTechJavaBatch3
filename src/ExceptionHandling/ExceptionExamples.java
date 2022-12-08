package ExceptionHandling;

import java.util.Scanner;

public class ExceptionExamples {

	public static void main(String[] args) {
		divide();

	}

	public static void divide() {

		Scanner myScan = new Scanner(System.in);
		System.out.print("Please Enter 1st number: ");
		int num1 = myScan.nextInt();
		System.out.print("Please Enter 2nd number: ");
		int num2 = myScan.nextInt();
		int result = 0;
		try {
			result = num1 / num2;
			System.out.println("Result: " + result);
		} catch (Exception ex) {
			System.out.println("Sorry can't divide a number by Zero");
			System.out.println(ex.getMessage());
		}
		System.out.println("Outside of the catch block");

	}

}
