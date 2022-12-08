package primetech.java.homepractice;

public class Forloop_HandsOn {
	public static void main(String[] args) {
//		
		for (int i = 0; i < 10; i++) {
			System.out.println("I love Java!");

			int[] grades = { 90, 92, 94, 96, 98, 100 };

			for (int ri = 0; ri < grades.length; ri++) {
				System.out.println(grades[ri]);

				int a = 0;

				while (a < 10) {
					System.out.println("a is less than 10: " + a);
					a++;
				}

			}

		}
	}
}
