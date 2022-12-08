package Constructors;

public class Main_Employee {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee ("Sam Karmah", 7982, "Sales Manager", 4);
		Employee emp2 = new Employee ("Devon Bondy", 1185, "Sales Manager", 7);
		Employee emp3 = new Employee ("Dilan Kareem", 7894, "Sales Manager", 13);
		
		emp1.printEmpInfo();
		System.out.println("-------------");
		emp2.printEmpInfo();
		System.out.println("-------------");
		emp3.printEmpInfo();

	}

}
