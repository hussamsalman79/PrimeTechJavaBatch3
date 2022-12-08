package class_09_07_static_Arrays;

public class State {
	
	// Declaring Static variable 
	public static String country; 
	
	private String name; 
	private int population; 
	
	
	public State (String name, int population) {
		
		this.name = name; 
		this.population = population; 
	}
	
	
	public String getName() {
		return this.name;
	}
	public int getpopulaton() {
		return this.population; 
	}
	
	public void printCountry() {
		System.out.println("Country: " + country);
	}
	
	
	

}
