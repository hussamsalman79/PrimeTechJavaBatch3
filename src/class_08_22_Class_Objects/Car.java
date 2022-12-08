package class_08_22_Class_Objects;

public class Car {

	String make;
	String model;
	String color;
	String year;

	// Method: Describe the behavior of the object
	// public: is the access modifier which will define the accessibility
	// void: It is the return type from this method
	// drive: It is the name of the method
	// (): will pass data to the method

	public void Breaks() {
		System.out.println("The Car has new Brakes!!");
		System.out.println("Breaking will stop the car");
	}
	public void drive() {
		System.out.println("Car is driving!!");
		System.out.println("Driving method is called");
	}
	public String carInfo() {
		return "Sedan, 4 doors, 4WD, Sun Roof";
	}

	public int carYear() {
		return 2015;
	}
	public int carPrice() {
		return 25000;
	}
	public void carTax(int tax) {
		System.out.println("Car Tax is: $" + tax);
	}
	public void printTotalPrice(int amount, double taxRate) {
		double totalPrice = amount + amount * taxRate;
		System.out.println("Total Price:" + totalPrice);
	}

}
