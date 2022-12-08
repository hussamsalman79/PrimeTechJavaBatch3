package class_08_17_loops;

import java.util.Scanner;

public class HandsOn_Loops {
	public static void main(String[] args) {
		
		String correctAnswer = "4";
		boolean isCorrect = true;
		while(isCorrect) {
			System.out.println("What is the result of 2 + 2?");
			Scanner scanner = new Scanner(System.in);
			String answers = scanner.nextLine();
			if(answers.equals(correctAnswer)) {
				System.out.println("You passed the exam. now you can move on");
				isCorrect = false;
			}
			else {
				System.out.println("You failed the exam. please try again");
			}
		}
	}
}
		