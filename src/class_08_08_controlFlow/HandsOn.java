package class_08_08_controlFlow;

public class HandsOn {
	public static void main(String[] args) {
		int age = 33;
		switch (age) {
		case 18:
			System.out.println("He is a hight school student");
			break;
		case 22:
			System.out.println("He is a college student");
			break;
		default:
			System.out.println("Your age is not qualified");
		}
	}
}
