package class_09_20_Abstract_part02;
/*
 * ==> Create another class call BankOfAmericaATM
 * ==>have BankOfAmericaATM extends ATM abstract class
 *  provide all the implementation of abstract methods just like 
 * 	==>how we did in ChaseATM
 */

abstract class ATMBOA {

	abstract void withdraw(double amount);

	abstract void depositCash(double amount);

	abstract void showBalance();

	abstract void newBalance();

}

class BankOfAmerica extends ATMBOA {

	double balance;

	public BankOfAmerica(double balance) {
		this.balance = balance;
	}

	void withdraw(double amount) {
		balance = balance - amount;

	}

	void depositCash(double amount) {
		balance = balance + amount;

	}

	void showBalance() {
		System.out.println("Your current balance is: " + balance + " dollars");

	}

	void newBalance() {
		System.out.println("Your new balance balance is: " + balance + " dollars");

	}

}
	public class Task {

	public static void main(String[] args) {

		ATMBOA boa = new BankOfAmerica(1000.00);
		boa.showBalance();
		boa.withdraw(200);
		boa.newBalance();
		
		System.out.println("-------------------");
		
		boa.showBalance();
		boa.depositCash(700);
		boa.newBalance();

	}

}
