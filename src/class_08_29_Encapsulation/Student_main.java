package class_08_29_Encapsulation;

public class Student_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student st1 = new Student(); 
		
		st1.setSSN(123456789);
		long ssn = st1.getSSN();
		System.out.println(ssn); 
		
		st1.setName("Husam Karmah");
		String name = st1.getName(); 
		System.out.println(name);
		

	}

}
