package primetech.java.demo;

import java.util.Scanner;

public class Pizza {

	String size;
	int toppings;
	double bill;

	Scanner myScan = new Scanner(System.in);

	public String Size() {
		while (true) {
			System.out.print("What size pizza would you like: ");
			String size1 = myScan.next();
			size = size1;
			if (size1.equalsIgnoreCase("small")) {
				System.out.println("Your pizza size is: " + size1);
			} else if (size1.equalsIgnoreCase("meduim")) {
				System.out.println("Your pizza size is: " + size1);
			} else if (size1.equalsIgnoreCase("large")) {
				System.out.println("Your pizza size is: " + size1);
			} else {
				System.out.println("Your request is invalid");
				continue;
			}
			return size;
		}
	}

	public int Toppings() {

		while (true) {
			System.out.print("How many toppings would you like: choose between 1-4: ");
			int toppings1 = myScan.nextInt();
			toppings = toppings1;
			
			if  (toppings1 == 1) {
				System.out.println("Choose your one toppings: Cheese, Chiken, Beef, Peproni");
				String toppings2 = myScan.next(); 
				System.out.println("You have seclected : " + toppings2 + " toppings");
			}
			else if (toppings1 ==2) {
				System.out.println("Choose your 1st toppings: Cheese, Chiken, Beef, Peproni");
				String toppings3 = myScan.next(); 
				System.out.println("Choose your 2nd toppings: Cheese, Chiken, Beef, Peproni");
				String toppings4 = myScan.next(); 
				System.out.println("You have selected : " + toppings3 + " and " +toppings4 + " toppings");
			}
			else if(toppings ==3) {
				System.out.println("You have: " + toppings1 + " toppings");
			}
			else if (toppings ==4) {
				System.out.println("You have: " + toppings1 + " toppings");
			}
			else {
				System.out.println("Yor request is invalid" );
			continue;
			}
			return toppings;
		}
		
	}

	public double fianlBill() {

		if (size.equalsIgnoreCase("small")) {

			bill = 5 + (toppings * 2);

			System.out.println("Your final bill is: $" + bill);
		}
		if (size.equalsIgnoreCase("meduim")) {

			bill = 10 + (toppings * 2);
			System.out.println("Your final bill is: $" + bill);
		}

		if (size.equalsIgnoreCase("large")) {
			bill = 15 + (toppings * 2);
			System.out.println("Your final bill is: $" + bill);
		}

		return bill;

	}

}
