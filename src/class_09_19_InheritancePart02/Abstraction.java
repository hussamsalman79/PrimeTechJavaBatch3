package class_09_19_InheritancePart02;

public class Abstraction {
	public static void main(String[] args) {
		
	// We cannot create object from abstract class 
	//AbstractExample obj1 = new AbstractExample(); ==> will give us an error
		
		Dog d1 = new Dog(); 
		d1.makeSound();
		d1.eat();
		System.out.println("-----------------------------");
		Animal animal = new Dog(); 
		animal.eat();
		animal.makeSound();
		
	}

}


abstract class Animal {
	public abstract void makeSound(); 
	public void eat() {
		System.out.println("Animals eat different type of food ");
	}
	
}

class Dog extends Animal{
	public void makeSound() {
		System.out.println("Dogs are Barking");
		
	}
	
	
	
}



// Creating abstract class 
abstract class AbstractExample{

// Creating concrete (regular)  method - it has body 
	public void printInfo(String text) {
		System.out.println(text);
	}
	
// Creating abstract method
// We can use all access modifiers with it public, private, protected, and default
// it has no body 
	abstract void hello(); 
	
	
	
}
