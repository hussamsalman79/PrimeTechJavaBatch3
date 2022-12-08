package class_09_26_Polmorephism;

public class MethodOverridingExample2 {
	public static void main(String[] args) {

		Animal animal1 = new Dog();
		Animal animal2 = new Cat();
		Animal animal3 = new Duck();
		animal1.sound();
		animal1.eat();
		animal2.sound();
		animal2.eat();
		animal3.sound();
		animal3.eat();

	}
}

abstract class Animal {
	// concrete method
	public void eat() {
		System.out.println("Animal is eating");
	}

	// abstract method
	public abstract void sound();
}

class Dog extends Animal {

	@Override
	public void sound() {
		System.out.println("Woof Woof Woof!!");

	}

}

class Cat extends Animal {

	@Override
	public void sound() {
		System.out.println("Meao Meao Meao !!!");

	}

}

class Duck extends Animal {

	@Override
	public void sound() {
		System.out.println("Quack Quack Quack!");

	}

}