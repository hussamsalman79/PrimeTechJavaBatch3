package class_08_09_controlflow;

import java.util.Scanner;

public class HandsOn_02 {
	
	/*switch (day) {
	case "One":
		System.out.println("Monday");
		break;
	case "Two":
		System.out.println("Tuesday");
		break;
	case "Three":
		System.out.println("Wednesday");
		break;
	case "Four":
		System.out.println("Thursday");
		break;
	case "Five":
		System.out.println("Friday");
		break;
	case "Six":
		System.out.println("Saturday");
		break;
	case "Seven":
		System.out.println("Sunday");
		break;
	}*/
	public static void main(String[] args) {

		Scanner myScan = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = myScan.nextInt(); 
		System.out.println(num);
		
		System.out.println("Please enter a String");
		Scanner myScan2 = new Scanner(System.in);
		String text = myScan2.nextLine(); 
		System.out.println(text);
		
		
	}
}
