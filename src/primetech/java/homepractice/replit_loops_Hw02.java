package primetech.java.homepractice;

public class replit_loops_Hw02 {

	public static void main(String[] args) {

//Write a program that prints the sum of all odd number between 0 - 20

		int sum = 0;
		for (int i = 1; i <= 20; i++) {

			if (i % 2 != 0) {

				System.out.println(sum + "+" + i + "=" + (sum + i));
				sum = sum + i;

			}
		
		}
		System.out.println("The sum of all odd number between 0 - 20 is: " + sum);
	}

}
