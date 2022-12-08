package primetech.java.homepractice;

import java.util.Scanner;

public class replit_loops_Hw03 {


	public static void main(String[] args) {

//Write a program that keeps asks user for age until user provided appropriate age 
//age has to be >=21 when age is match program will print: "Welcome to the Club" 
//and exist the loop When age is not match the program will keep asking the same question

		while (true) {
			Scanner myScan = new Scanner(System.in);
			System.out.print("Please Enter your age: ");
			int age = myScan.nextInt();

			if (age >= 21) {
				System.out.println("Welcome to the club");
				break;
			} 
			else {

				System.out.println("Age is invalid");
			}

		}

	}

}
