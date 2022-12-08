package class_09_20_Abstract_part02;

//Abstract Class 
abstract class ATM {
	
	// Concrete method - means regular method which we can add in the abstract class
	public void shutDown() {
		System.out.println("ATM is OFF");
	}

	// Abstract Methods:
	abstract void withdraw(double amount);

	abstract void depositCash(double amount);

	abstract void showBalance();
	abstract void newBalance();

}


class ChaseATM extends ATM{
	
	double balance; 
	
	public ChaseATM(double balance) {
		this.balance=balance;
	}
	
	void withdraw(double amount) {
		balance = balance - amount;
		
	}
	void depositCash(double amount) {
		balance= balance+amount; 
		
	}
	void showBalance() {
		System.out.println("Your current balance is: " + balance + " dollars");
	}
	void newBalance() {
		System.out.println("Your new balance balance is: " + balance + " dollars");
	}
}

public class AbstractClassExample {

	public static void main(String[] args) {
		// we creating object from ATM class to hide the implementation 
		ATM chase = new ChaseATM(1000.00); 
		chase.showBalance(); 
		chase.depositCash(500);
		chase.newBalance(); 
		chase.shutDown();
	}

}
