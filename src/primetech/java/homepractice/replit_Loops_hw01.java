package primetech.java.homepractice;

public class replit_Loops_hw01 {
	
	//Write a program that prints iterate trough numbers 1 - 100
	//and only prints the numbers that can be divided by 3 and has no reminder
	
	public static void main(String[] args) {
		
		int num =1; 
		for (int i=1; i<=100; i++) {
			
			if (num%3==0) {
				
				System.out.println(num);
			}
			num++;
		}
		

	}

}
