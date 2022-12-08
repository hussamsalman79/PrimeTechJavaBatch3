package Constructors;

public class Employee {
	
	String name;
	int empId; 
	String position; 
	int exp; 
	
	
	Employee(String newName, int newId, String newPos, int newExp){
		
		name =newName; 
		empId = newId; 
		position = newPos; 
		exp = newExp; 
	}
	
	public void printEmpInfo() {
		
		System.out.println("Name: " + name);
		System.out.println("Employeee ID: " + empId);
		System.out.println("Position: " + position);
		System.out.println("Years of Exprience: " + exp);
		
	}
	
	

}
