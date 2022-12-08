package class_08_17_loops;

import java.util.Scanner;

public class HandsOn_for_loop_practice {

	public static void main(String[] args) {

		Scanner myScan = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int num = myScan.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.println(i + "X" + num + " = " + (i * num));

		}

	}
}
