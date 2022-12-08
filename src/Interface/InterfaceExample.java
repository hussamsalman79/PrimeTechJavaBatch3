package Interface;
// We have to start with interface instead of class before the main method class 
interface WaterBottle{
	// Declare any variables needs to be used in main method 
	String color = "Blue";
	String color2 = "Green";
	String liquid = "Water";
	String liquid2 = "Juice"; 
	void addition();
	void fillUp(); // methods to be implemented in the main method 
	void pourOut(); // methods to be implemented in the main method 
	
}

// We need to add implements + the interface class name to main method class name 
public class InterfaceExample implements WaterBottle{

	public static void main(String[] args) {
		// create an interface object 
		InterfaceExample example = new InterfaceExample(); 
		// Object implements the interface methods 
		example.fillUp();
		System.out.println("-------------------------------------");
		example.pourOut();
		System.out.println("-------------------------------------");
		example.addition();
		
	}

	// Methods are exists in the interface class 
	public void fillUp() {
		System.out.println("Bottle s filled with " + liquid);
		System.out.println("The color of the Bottle is " + color);
		
		
		
	}
	
	public void pourOut() {
		System.out.println("Bottle s pouring with " + liquid2);
		System.out.println("The color of the Bottle is " + color2);
		
	}

	public void addition() {
		int x = 3; 
		int y = 5; 
		int total = x*y; 
		System.out.println("The total is: " + total);
	}

}
