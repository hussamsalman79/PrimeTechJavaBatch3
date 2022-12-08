package class_09_19_InheritancePart02;

public class MethodOverriding {
	
	public static void main(String[] args) {
		
		Child myChild = new Child(); 
		myChild.sayHello();
		myChild.ChidName();
		
	}

}

class Parent{
	public void sayHello() {
		System.out.println("Parent is Saying Hello");
	}
	public void ChidName() {
		System.out.println("The Child Name is Kevin");
	}
}
// Comment out the methods in the Child class and run it
class Child extends Parent{
	public void sayHello() {
		System.out.println("Child is Saying Hello");
	}
	public void ChidName() {
		System.out.println("The Child Name is Tommy");
	}
	
}