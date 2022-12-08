package class_09_13_AccessModifiers_Inheritance;

public class SingleInheritance {
	
	public static void main(String[] args) {
		
		BMW bmw1 = new BMW(); 
		System.out.println(bmw1.numberOfWheels);
		bmw1.model = "M3"; 
		bmw1.year = 2022; 
		
		bmw1.brake();
		bmw1.drive();
		bmw1.printOrigin();	
	}
}


class Car {
	public int numberOfWheels = 4; 
	
	public void brake() {
		System.out.println("Braking");
	}
	public void drive() {
		System.out.println("Driving");
	}
	
	
}

class BMW extends Car{
	int year; 
	String model; 
	public void printOrigin() {
		System.out.println("Made in Germany");
	}
}