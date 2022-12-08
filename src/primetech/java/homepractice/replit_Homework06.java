package primetech.java.homepractice;

import java.util.Scanner;

public class replit_Homework06 {

	/*
	 * Print the price for the below products: iphone: 1000 dollars tv: 2000 dollars
	 * applewatch: 500 dollars computer: 50000 dollars invalid case: invalid
	 * selection.
	 */

	public static void main(String[] args) {

		Scanner myScan = new Scanner (System.in); 
		System.out.println("Please Enter what device you are looking for: ");
		String Device = myScan.next(); 

		switch (Device) {
		case "iphone":
			System.out.println("Iphone price is = $1000");
			break;
		case "TV":
			System.out.println("TV price is = $2000");
			break;
		case "Applewatch":
			System.out.println("Apple Watch price is = $500");
			break;
		case "Computer":
			System.out.println("Computer price is = $5000 ");
			break;
		default:
			System.out.println("invalid selection");

		}

	}

}
