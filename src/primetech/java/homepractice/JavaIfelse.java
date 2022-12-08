package primetech.java.homepractice;

public class JavaIfelse {
	public static void main(String[] args) {
		int age =55; 
		
		if (age < 18) {
			System.out.println("You are not old enough to get insurance, please ask your parent to add you to their insurance");
		}
		else if (age >=18 && age<55) {
			System.out.println("You are allowed to buy insurance, and your price is: xxx amount");
		}
		else {
			System.out.println("We are sorry, we do not offer senior insurance. Please contact another insurance company ");
		}

	}

}
		

		
	
	