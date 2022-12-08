package primetech.java.homepractice;

import java.util.ArrayList;

public class Arrays_handsOn {

	public static void main(String[] args) {
		
		String [] cars= {"Toyota", "VolksWagen", "Honda", "Ford", "Mercedes"}; 
		
		String [] models = {"Avalon", "Passat", "Accord", "Escape", "C300"}; 
		
		int [] year = {2002, 2012, 2014, 2015, 2016}; 
		
		System.out.println("My 1st car: " + cars[0] + " " + models[0] + " " + year[0]);
		System.out.println("My 2nd car: " + cars[1] + " " + models[1] + " " + year[1]);
		System.out.println("My 3rd car: " + cars[2] + " " + models[2] + " " + year[2]);
		System.out.println("My 4th car: " + cars[3] + " " + models[3] + " " + year[3]);
		System.out.println("My 5th car: " + cars[4] + " " + models[4] + " " + year[4]);
		
		
		ArrayList <String> carList = new ArrayList<String>(); 
		carList.add("Toyota Avalon 2002"); 
		carList.add("Ford Escape 2015"); 
		carList.add("VW Passat 2012"); 
		carList.add("MB C300 2015"); 
		
		System.out.println("-----------------");
		
		System.out.println(carList);
		
		
		
		
	

	}

}
