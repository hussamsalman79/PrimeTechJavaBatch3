package Replit_HomeWork;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_replit_HW {
	public static void main(String[] args) {
		
	ArrayList <String> carList = 
			new ArrayList<String>(Arrays.asList("Ford","Honda","BMW","Toyota","Nissan")); 
	
		//use for loop to loop through all the element and print them on the console
		for (int i=0; i<carList.size(); i++) {
			System.out.println(carList.get(i));
		}
		//use For-each loop to loop through all the elements and print them on the console
		System.out.println("--------------------------");
		for (String MyList : carList) {
			
			System.out.println(MyList);
		}
		System.out.println("--------------------------");
		//Get the 3rd Element and print it on the console
		System.out.println("The 3rd Element on the console is: " + carList.get(3));
		System.out.println("--------------------------");
		//remove the second element from the List
		carList.remove(1); 
		System.out.println("After removing the 2nd element: " + carList);
		System.out.println("--------------------------");
		//replace the Element on the index 2 with word Java
		carList.set(2, "Java"); 
		System.out.println("After replacing the 2nd element: " + carList);
		System.out.println("--------------------------");
		//clear the list
		carList.clear();
		System.out.println("After clear the list : " + carList);
		
	}

}
