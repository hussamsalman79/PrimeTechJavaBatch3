package primetech.java.homepractice;

public class replit_Homework04 {
	
	/*Write a Java Program for the following logic:
		if grade is < 55, then print “Fail”;
		if grade is >= 55, but less than 80, then print “Pass”;
		if grade is >= 80, then print “Passed with Distinction”.*/
	
	
		public static void main(String[] args) {
			
			int grade = 77; 
			
			if (grade < 55) {
				System.out.println("Fail");
			}
			else if (grade >= 55 && grade < 80) {
				System.out.println("Pass");
			}
			else if (grade >= 80) {
				System.out.println("Passed with Distinction");
			}	
		}

}
