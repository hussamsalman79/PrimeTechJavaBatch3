package ExceptionHandling;

public class IsRelationshipDemo {

	public static void main(String[] args) {
		// Child class object can be assign to parent class variable
		Person person = new Student();
		// Parent lass object can't be assign to child class variable
		//Student student = new Person();

		// Student is a Person
		// Muneer is a Student
		// so: Muneer be a Person ? yes: Muneer is a Person

		Student student1 = new Muneer();
		Person person1 = new Muneer();

		// Person is not a Student
		// Person is not a Muneer
		//Muneer muneer1 = new Person();

	}

}

class Person {

}

class Student extends Person {

}

class Muneer extends Student {

}
