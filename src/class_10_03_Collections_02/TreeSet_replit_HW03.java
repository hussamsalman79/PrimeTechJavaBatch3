package class_10_03_Collections_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_replit_HW03 {
	
	public static void main(String[] args) {
		//Create TreeSet of String
		TreeSet<String> cars = new TreeSet<>(); 
		//Add 5 random Strings
		cars.add("Toyota"); 
		cars.add("VW"); 
		cars.add("Ford"); 
		cars.add("Mercedes"); 
		cars.add("Honda"); 
		System.out.println(cars);
		//remove element on index 0 and 1
		//sort the elements in ascending orders
		cars.remove("Toyota");
		cars.remove("VW"); 
		System.out.println("sort the elements in ascending orders: " + cars);
		//sort the element in descending order
		ArrayList<String> myCars = new ArrayList<String>(cars); 
		Collections.sort(myCars, Collections.reverseOrder());
		System.out.println("sort the element in descending order: " + myCars);
		//use iterator to loop through the TreeSet
		Iterator <String> itra = cars.iterator();
		System.out.println("------Iterator Loop------");
		while(itra.hasNext()) {
			System.out.println(itra.next());
		}
		//use for loop to loop through the TreeSet
		System.out.println("------for Loop------");
		for(int i=0; i<cars.size(); i++) {
			System.out.println(myCars.get(i));
		}
		//use for each loop to loop through the TreeSet
		System.out.println("------for each Loop------");
		for(String carslist : cars) {
			System.out.println(carslist);
		}
		//convert the ArrayList to Array
		System.out.println("------ArrayList to Array------");
		Object[] carsArr = cars.toArray(); 
		for(int i=0; i<carsArr.length; i++) {
			System.out.println(carsArr[i]);
		}
		
		
	}
	
	
	

}
