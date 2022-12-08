package class_08_30_Constructor;

public class Student {

	String name;  
	int age;

	public Student() {
		name = "Robot"; 
		age = 5; 
		
		System.out.println("Hi my name is " + name + ", and my age is " + age + " years old");
		
	}
	public Student(String name, int age) {

		this.name = name;
		this.age = age;
	}
	public void pritntStudetInfo() {

		System.out.println("Hi my name is " + name + ", and my age is " + age + " years old");
		
	}

}
