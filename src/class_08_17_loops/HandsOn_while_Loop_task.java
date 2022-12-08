package class_08_17_loops;

import java.util.Scanner;

public class HandsOn_while_Loop_task {
	
	public static void main(String[] args) {
		
		
		int right = 25; 
		boolean answer = true; 
		while (answer) {
		Scanner myScan = new Scanner (System.in); 
		System.out.println("Waht is the answer for 5 x 5 = ");
		int result = myScan.nextInt(); 
		if (result == right ) {
			
			System.out.println("Right Answer");
			 break;
		}
		else {
			System.out.println("Try again");
		}
		
		
		
		
		
		
	}
	}
}
