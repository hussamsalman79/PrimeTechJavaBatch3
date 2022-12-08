package class_08_29_Encapsulation;

public class Mortgage_main {

	public static void main(String[] args) {

		Mortgage loan1= new Mortgage(); 
		
	loan1.setTotalAmount(200000);
	loan1.setRate(0.1);
	loan1.settotalMonth(84);
//	loan1.printMonthlyPayment();
	System.out.println(loan1.getTotalAmount());
	System.out.println(loan1.getRate());
		
		
		
		
		
		
		

	}

}
