package class_08_30_Constructor;

public class Main_Student {

	public static void main(String[] args) {

		Student std1 = new Student(); 
		Student std2 = new Student ("Sam", 43);
		Student std3 = new Student ("Rocky", 30); 
		
		System.out.println("--------------");

		std2.pritntStudetInfo();
		
		System.out.println("--------------");
		
		System.out.println("Name: " + std2.name);
		System.out.println("Age: " + std2.age);
	
		System.out.println("--------------");
		
		std3.pritntStudetInfo();
		
	}
}
