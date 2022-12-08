package class_08_30_Constructor;

public class House {
	
	private String type; 
	private int value; 
	
	 int numOfBed; 
	 String location; 
	
	
	public void setType (String newType ) {	
		type = newType; 
	}
	
	public String getType() {
		return type; 
	}
	
	public void setValue(int newValue) {
		value = newValue; 
	}
	
	public int getValue() {
		return value;
	}
	
	House (int numOfBed, String location){
		
		this.numOfBed = numOfBed; 
		this.location = location;
	}
	
	public void printIfo() {
		
		System.out.println("House Type: " + type);
		System.out.println("House value: $" + value);
		System.out.println("Number of Bedrooms: " + numOfBed );
		System.out.println("Location: " + location );
	}

	
	
	
}
