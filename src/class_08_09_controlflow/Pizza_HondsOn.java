package class_08_09_controlflow;

import java.util.Scanner;

public class Pizza_HondsOn {
	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		System.out.print("What size pizza would you like: ");
		String size = myScan.next();
		int total;
		System.out.print("How many toppings would you like?: ");
		int toppings = myScan.nextInt();

		if (size.equals("Small")) {
			total = 5 + (toppings * 2);
			System.out.println("Your total bill is = $ " + total);

		} else if (size.equals("Meduim")) {
			total = 10 + (toppings * 2);
			System.out.println("Your bill is = $ " + total);
		}

		else if (size.equals("Large")) {
			total = 15 + (toppings * 2);
			System.out.println("Your bill is = $ " + total);
		} else {
			System.out.println("Invalid Request, Please see the Casheir");
		}
	}
}
