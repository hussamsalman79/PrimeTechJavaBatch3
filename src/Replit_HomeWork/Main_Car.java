package Replit_HomeWork;

public class Main_Car {
	public static void main(String[] args) {
		
		Car myCar = new Car();
	    
	    myCar.setMake("BMW");
	    String make = myCar.getMake(); 

	    myCar.setModel("M3"); 
	    String model =myCar.getModel(); 

	    myCar.setColor ("Black"); 
	    String color = myCar.getColor(); 

	    myCar.printCarInfo(); 


		
	}

}
