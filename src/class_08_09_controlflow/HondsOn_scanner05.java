package class_08_09_controlflow;

import java.util.Scanner;

public class HondsOn_scanner05 {
	public static void main(String[] args) {
		
		Scanner Myscan = new Scanner (System.in); 
		System.out.println("Please enter a first number ");
		int num = Myscan.nextInt(); 
		System.out.println("Please enter a second number ");
		int num2 = Myscan.nextInt();
		int result = num + num2; 
		System.out.println("Result = " + result) ;
	
	}

}
