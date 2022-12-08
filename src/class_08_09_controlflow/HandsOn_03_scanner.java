package class_08_09_controlflow;

import java.util.Scanner;

public class HandsOn_03_scanner {
	
	public static void main(String[] args) {
		
	Scanner Scan3= new Scanner(System.in); 
	System.out.println("Are you a male? Please enter true/false");
	boolean isMale = Scan3.nextBoolean(); 
	
	if (isMale) {
		System.out.println("Male");
	}
	else {
		System.out.println("Female");
	}
	
	}

}
