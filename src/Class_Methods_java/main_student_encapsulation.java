package Class_Methods_java;

public class main_student_encapsulation {

	public static void main(String[] args) {
		
		Student s = new Student(); 
		Student t = new Student(); 
		Student d = new Student(); 
		s.setName("Husam Karmah");
		s.setAge(43);
		s.setGender("Male");
		s.setSudId(1175);
		s.setMajor("Inforamtion Technology");
		s.setGba(3.6);
		s.setSchool("Northern Virginia Community College");
		
		t.setName("Noora Al Naqqqash");
		t.setAge(40);
		t.setGender("Female");
		t.setSudId(7982);
		t.setGba(3.8);
		t.setMajor("Early Childhood Education");
		t.setSchool("Northern Virginia Community College");
		
		d.setName("Aws");
		d.setAge(12);
		d.setGender("Male");
		d.setSudId(1016);
		d.setMajor("Middle School");
		d.setGba(3.4);
		d.setSchool("Brambleton Middle School");
		
		s.printStudentInfo();
		System.out.println("----------------");
		t.printStudentInfo();
		System.out.println("----------------");
		d.printStudentInfo();
	}

}
