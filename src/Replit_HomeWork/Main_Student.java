package Replit_HomeWork;

public class Main_Student {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setName("bot");
		s1.setAge(20);
		
		s1.printStudentInfo();
		
		Student.courseName ="SDET"; 
		Student.schoolNanme ="PrimeTech"; 
		s1.courseName();
		s1.schoolName();
		
		

	}

}
