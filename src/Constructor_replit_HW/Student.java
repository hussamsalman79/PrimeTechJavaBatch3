package Constructor_replit_HW;

public class Student {
	
	String name; 
	int age; 
	
//	public Student() {
//		this.name = "Bob"; 
//		this.age = 20; 
//	}


//	
//	
	Student (String newName, int newAge){
		name = newName; 
		age = newAge; 
	}
	
	public void printStudentInfo() {
		
		System.out.println("Name of the Student: " + name );
		System.out.println("Age of the Student: " + age);
	}

}
