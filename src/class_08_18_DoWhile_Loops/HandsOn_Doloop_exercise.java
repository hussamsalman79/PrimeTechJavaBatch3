package class_08_18_DoWhile_Loops;

import java.util.Scanner;

public class HandsOn_Doloop_exercise {

	public static void main(String[] args) {

		Scanner myScan = new Scanner(System.in);
		System.out.print("Please Enter a number: ");
		int num = myScan.nextInt();

		int mul = 0;
		for (int i = 0; i <= 20; i++) {
			mul = num * i;
			System.out.println(num + "x" + i + "=" + mul);
		}

	}
}