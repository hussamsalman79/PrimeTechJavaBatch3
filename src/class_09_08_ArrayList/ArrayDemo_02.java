package class_09_08_ArrayList;

public class ArrayDemo_02 {

	public static void main(String[] args) {

		// For loop
		String[] words = { "Hello", "Good morning", "Good afternoo", "Good evening", "Good night" };

		System.out.println(words.length);

		// Printing array elements in Ascending order
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}

		System.out.println("-------------------------");

		// Printing array elements in Descending order
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.println(words[i]);

		}

	}

}
