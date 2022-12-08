package Replit_HomeWork;

public class Car {
	
	String make;
	  String model;
	  String color;

	  public void setMake(String make){
	    this.make = make; 
	  }
	  public String getMake(){
	    return this.make; 
	  } 

	public void setModel (String model){
	 this.model =model; 
	}

	  public String getModel(){
	    return this.model; 
	  }

	  public void setColor(String color){
	    this.color = color; 
	  }
	   public String getColor(){
	     return this.color; 
	   }
	  public void printCarInfo() {
	    System.out.println ("Make: "+ this.make + ", Model: " + this.model + ", Color: " + this.color);
	    
	  }

	

}
