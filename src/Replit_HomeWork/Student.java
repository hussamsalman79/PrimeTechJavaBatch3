package Replit_HomeWork;

public class Student {

	private String name;
	private int age;

	public static  String courseName;
	public static String schoolNanme;

	public void setName(String newName) {
		name = newName;
	}

	public String getName() {
		return name;
	}

	public void setAge(int newAge) {
		age = newAge;
	}

	public int getAge() {
		return age;
	}

	public void courseName() {
		System.out.println("Course Name:" + courseName);

	}

	public void schoolName() {
		System.out.println("School Name: " + schoolNanme);

	}

	public void printStudentInfo() {
		System.out.println("Name of the Student: " + name);
		System.out.println("Age of the Student: " + age);

	}

}
