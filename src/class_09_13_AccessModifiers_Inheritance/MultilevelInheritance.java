package class_09_13_AccessModifiers_Inheritance;

import java.util.Arrays;

public class MultilevelInheritance {
	public static void main(String[] args) {
		
		Student student1 = new Student();
		System.out.println(student1.schoolAddress);
		student1.age = 25;
		student1.name = "Muneer";
		student1.practiceJava();
		String[] courses = student1.courses;
		System.out.println(Arrays.toString(courses));
		String[] teahers = student1.teachers;
		System.out.println(Arrays.toString(teahers));
		
	}

}

class PrimeTech{
	public String[] teachers = {"Polat","Helil", "Ajay"};
	public String schoolAddress = "Fairfax";
	public String[] courses = {"SDET", "Full Stack Web Developer"};
	
	public void teachJava() {
		System.out.println("Teaching Java");
	}
	public void teachSQL() {
		System.out.println("Teaching SQL");
	}
}

class SDETBatch3 extends PrimeTech{
	public String[] students = {"Muneer", "Mohamad", "Mutlu"};
	public String course = "Software Engineer in Test";
	
}

class Student extends SDETBatch3{
	String name;
	int age;
	public void practiceJava() {
		System.out.println("Practice Java");
	}
}
