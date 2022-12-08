package Abstract;

public class ATMmain {

	public static void main(String[] args) {
		
		ATM card1 = new BankOfAmericaATM(); 
		card1.withdraw(200); 
		card1.depositCash(250);
		card1.depositCheck(650);
		card1.checkBalance();
		
		System.out.println("-------------------------------------");
		
		ATM card2 = new ChaseATM(); 
		card2.withdraw(300); 
		card2.depositCash(400);
		card2.depositCheck(750);
		card2.checkBalance();
	}

}
