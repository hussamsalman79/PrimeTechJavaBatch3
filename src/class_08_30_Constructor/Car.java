package class_08_30_Constructor;

public class Car {
	
	
	String model; 
	String make; 
	String color; 
	int year; 
	
	 Car(String newModel, String newMake, String newColor, int newYear) {
		model = newModel; 
		make = newMake; 
		color = newColor; 
		year = newYear;
	}
	
	public void pringCarInfo() {
		
		System.out.println("Model: " + model);
		System.out.println("Make: " + make);
		System.out.println("Color: " + color);
		System.out.println("Year: " + year);
	}

}
