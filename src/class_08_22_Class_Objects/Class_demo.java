package class_08_22_Class_Objects;

public class Class_demo {

	public static void main(String[] args) {

		Dog dog1 = new Dog();
		dog1.age = 1;
		dog1.breed = "German Shephered";
		dog1.size = "Large";
		dog1.color = "Brown";
		
		System.out.println("PitBull: ");
		System.out.println("Age: " + dog1.age);
		System.out.println("Breed: " + dog1.breed);
		System.out.println("Color: " + dog1.color);
		System.out.println("Size: " + dog1.size);
		
	
		
		System.out.println("-----------------------");

		Dog dog2 = new Dog();
		dog2.age = 2;
		dog2.breed = "PitBull";
		dog2.size = "Large";
		dog2.color = "Black";

		System.out.println("PitBull: ");
		System.out.println("Age: " + dog2.age);
		System.out.println("Breed: " + dog2.breed);
		System.out.println("Color: " + dog2.color);
		System.out.println("Size: " + dog2.size);
		
	}

	private static void age() {
		// TODO Auto-generated method stub
		
	}

}
