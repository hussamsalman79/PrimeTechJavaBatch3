package class_08_08_controlFlow;

public class Letters {
	public static void main(String[] args) {
		char letter = 'B';

		switch (letter) {
		case 'A', 'B', 'C', 'D':
			System.out.println("Found it ");
			break;
		default:
			System.out.println("Not Found");
		}
	}
}
