package class_09_07_static_Arrays;

import java.time.Month;
import java.util.Arrays;

public class Arrays_Demo02 {
	
	public static void main(String[] args) {
		
		// Another way to declare & initializing an array in one step
	
		String [] months = {"January", "February", "March", "April", "May", "June"}; 	
		System.out.println(Arrays.toString(months));
	
		System.out.println("----------------------");
		
		int [] ranNumbers = {10, 20, 30, 40}; 
		System.out.println(ranNumbers[0]);
		System.out.println(ranNumbers[1]);
		System.out.println(ranNumbers[2]);
		System.out.println(ranNumbers[3]);
		
		
	}

}
