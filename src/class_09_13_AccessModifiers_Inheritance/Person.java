package class_09_13_AccessModifiers_Inheritance;

public class Person  extends Human{
	
	// Access Modifiers: No private with Class 
	// Four types of modifiers : public, private, default, and protected
	// Provide access within same project
	
	public String name; 
	public int age;
	public String gender; 
	
	public Person() {	
	}
	
	
	 public void printInfo() {
		
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Gender: " + gender);
	}

	
	
}

	