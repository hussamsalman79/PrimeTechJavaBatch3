package class_08_08_controlFlow;

public class Task02 {
	public static void main(String[] args) {

		String animal = "parrot";

		switch (animal) {
		case "Dog":
			System.out.println("Dog is barking");
			break;
		case "Cat":
			System.out.println("Cat is meowing");
			break;
		case "Cow":
			System.out.println("Cow is mooooing");
		case "Lion":
			System.out.println("Lion is Roaring");
			break;
		default:
			System.out.println("Not supported sound");
		}

	}

}
