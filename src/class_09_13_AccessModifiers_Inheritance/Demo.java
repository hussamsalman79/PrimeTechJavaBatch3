package class_09_13_AccessModifiers_Inheritance;

public class Demo {
	
	public static void main(String[] args) {
		
		Person person = new Person(); 
		
		person.name = "Sam Karmah"; 
		person.age= 43; 
		person.gender = "Male";
		person.race = "White"; 
		person.language = "Arabic"; 
		person.cluture = "Middle East"; 
		
		person.talk();
		person.walk();
		
		
		Person person2 = new Person(); 
		person2.name ="Noora Al Naqqash"; 
		person2.age = 39; 
		person2.gender = "Female"; 
		
		person.printInfo();
		System.out.println("-------------------------------------------");
		person2.printInfo();
		
		
		
	}

}
