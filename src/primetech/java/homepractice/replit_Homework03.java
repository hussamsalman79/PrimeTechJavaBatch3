package primetech.java.homepractice;

public class replit_Homework03 {
	public static void main(String[] args) {

//	display which one is the smallest among them.

		int a = 15;
		int b = 1;
		int c = 0;
		int d = 5;

		if (a < b && a < c && a < d) {
			System.out.println("The smallest number  is a = "  + a);
		} else if (b < c && b < d) {
			System.out.println("The smallest number is b  = " + b);
		} else if (c < d && c < d) {
			System.out.println("The smallest number is c = " + c);
		}

		else {
			System.out.println("The smallest number is d = " + d);
		}
	}

}
