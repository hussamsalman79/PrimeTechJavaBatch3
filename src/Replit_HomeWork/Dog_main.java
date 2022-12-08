package Replit_HomeWork;

public class Dog_main {

	public static void main(String[] args) {
		
		Dog myDog = new Dog(); 
		
		myDog.setBreed("German Shepherd");
		String breed = myDog.getBreed(); 
		
		myDog.setAge("2");
		String age = myDog.getAge(); 
		
		myDog.setSize("Large"); 
		String size = myDog.getSize(); 
		
		myDog.setColor("White");
		String color = myDog.getColor(); 
		
		myDog.printDogInfo();
		
	
		
	}

}
