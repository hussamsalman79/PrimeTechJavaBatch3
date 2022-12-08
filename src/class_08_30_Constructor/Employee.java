package class_08_30_Constructor;

public class Employee {
	
	String name; 
	String jobTitle; 
	int EmpId; 
	double salary; 
	
	Employee (String name, String jobTitle, int EmpId, double salary){
		
		this.name = name; 
		this.jobTitle = jobTitle; 
		this.EmpId = EmpId; 
		this.salary = salary; 
	
	}
	
	public void printInfo() {
		
		System.out.println("Employee Name: " + name );
		System.out.println("Employee Job Title: " + jobTitle );
		System.out.println("Employee ID number: " + EmpId );
		System.out.println("Employee Annual Salary: $" + salary  );
		
		
	}
	


}
