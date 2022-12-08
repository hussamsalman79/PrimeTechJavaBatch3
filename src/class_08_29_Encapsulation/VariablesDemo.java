package class_08_29_Encapsulation;

public class VariablesDemo {
	
	// Instance Variables: Belongs to the objects not the class
	// They declare directly under the class outside of method.  
	// We need to create an object to access the instance variables 
	
	String name; 
	int age; 
	double salary; 
	
	public void method1() {
		name = "John"; // belong to the object
		age = 45; // belong to the object
		salary = 5000; // belong to the object
		
		// Local variable: BELONG TO THE method1
		// They declared within a method
		//
		String name; 
		int age; 
		double salary; 
		
	}
	public static void main(String[] args) {
		
		VariablesDemo obj1= new VariablesDemo(); 
		
		
	}

}
