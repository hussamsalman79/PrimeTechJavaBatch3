package class_08_18_DoWhile_Loops;

import java.util.Scanner;

public class HandsOn_loop_exrecise02 {
	public static void main(String[] args) {

		String vaildUser = "Sam1979";
		String validPassword = "12345";
		Scanner myScan = new Scanner(System.in);
		while (true) {
			System.out.print("Please enter username: ");
			String user = myScan.next();
			if (user.equals(vaildUser)) {
				System.out.println("Your Username: " + user);
			} else {
				System.out.println("You username is invalid");
				continue;
			}
			while (true) {
				System.out.print("Please enter passwrod: ");
				String password = myScan.next();
				if (password.equals(validPassword)) {
					System.out.println("Your Password is:" + password);
					break; 
				}
				else {
					System.out.println("Your password is invalid");			
				}
			}
			break; 
		}
	}
}
