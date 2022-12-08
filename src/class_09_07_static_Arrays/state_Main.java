package class_09_07_static_Arrays;

public class state_Main {

	public static void main(String[] args) {
		
		State st1 = new State ("Virginia" , 8000000 ); 
		
		System.out.println(st1.getName()); 
		System.out.println(st1.getpopulaton());
		State.country = "USA";
		
		// we need to us the Class name to be accessed in main method
		System.out.println(State.country);
		st1.printCountry();
		
		
		

	}

}
