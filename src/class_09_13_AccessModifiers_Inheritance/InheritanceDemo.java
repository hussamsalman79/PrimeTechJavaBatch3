package class_09_13_AccessModifiers_Inheritance;

public class InheritanceDemo {
	
	public static void main(String[] args) {
		
		Dog dog1 = new Dog(); 
		
		dog1.name = "Simba"; 
		dog1.age = 2; 
		dog1.drinkMilk();
		
		Cat cat1 = new Cat(); 
		
		cat1.breed = "Bengal";
		cat1.name = "Kisha"; 
		cat1.age = 2; 
		
		cat1.drinkMilk();
		
		
		
		
	}

}
