package Abstract;

public abstract class ATM {
	abstract void withdraw(double WithdrawAmount); 
	abstract void depositCash(double DepositAmount); 
	abstract void depositCheck(double CheckAmount); 
	abstract void checkBalance(); 
}

class BankOfAmericaATM extends ATM{
	
	double balance= 1500;
		void withdraw(double WithdrawAmount ) {
		balance = balance - WithdrawAmount; 
		System.out.println("Your Balance after withdraw is: $" + balance);
	}

	void depositCash(double DepositAmount) {
		balance = balance + DepositAmount; 
		System.out.println("Your Balance after Deposit is: $" + balance);
	}

	void depositCheck(double CheckAmount) {
		balance = balance + CheckAmount; 
		System.out.println("Your Balance after Check Deposit is: $" + balance);
	}

	void checkBalance() {
		System.out.println("Your Final Balance is: $" + balance);
	}
	
}

	class ChaseATM extends ATM{
		double balance = 2500;
		void withdraw(double WithdrawAmount) {
			balance = balance - WithdrawAmount; 
			System.out.println("Your Balance after withdraw is: $" + balance);
		}

		void depositCash(double DepositAmount) {
			balance = balance + DepositAmount; 
			System.out.println("Your Balance after Deposit is: $" + balance);
		}

		void depositCheck(double CheckAmount) {
			balance = balance + CheckAmount; 
			System.out.println("Your Balance after Check Deposit is: $" + balance);
		}

		void checkBalance() {
			System.out.println("Your Final Balance is: $" + balance);
		}
		
	}

	