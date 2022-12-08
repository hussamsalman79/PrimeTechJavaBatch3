package class_08_09_controlflow;

import java.util.Scanner;

public class HandsOn_scanner06 {
	public static void main(String[] args) {

		Scanner myScan = new Scanner(System.in);
		System.out.println("Please enter first number");
		int num1 = myScan.nextInt();
		System.out.println("Please enter second number");
		int num2 = myScan.nextInt();
		System.out.println("Please enter third number");
		int num3 = myScan.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println("The biggest numbe is: " + num1);
		} else if (num2 > num3) {
			System.out.println("The biggest numbe is: " + num2);
		} else {
			System.out.println("The biggest numbe is: " + num3);
		}
		

	}

}
