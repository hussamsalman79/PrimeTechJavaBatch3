package Test_accessModifiers_package;

import class_09_13_AccessModifiers_Inheritance.Human;
import class_09_13_AccessModifiers_Inheritance.Person;

public class Demo extends Human{
	
	public static void main(String[] args) {
		
		
		Person person = new Person(); 
		person.name = "Sam Karmah"; 
		person.age= 43; 
		person.gender = "Male";
		person.language = "Arabic"; 
		person.race = "White"; 
		
		Person person2 = new Person(); 
		person2.name ="Noora Al Naqqash"; 
		person2.age = 39; 
		person2.gender = "Female"; 
		person2.language = "Arabic"; 
		person2.race = "White"; 
		
		person.printInfo();
		System.out.println("-------------------------------------------");
		person2.printInfo();
		
	}
	
	

}
