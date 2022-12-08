package class_08_29_Encapsulation;

public class Mortgage {

	private double totalAmount;
	private double totalMonth;
	private double rate;
	
	public void settotalMonth(double totalMonth) {
		
		if (totalMonth >= 48 && totalMonth <=72) {
			this.totalMonth = totalMonth; 
		}
		else {
			System.out.println("Invaild entry");
		}
		
	}

	public double gettotalMonth() {
		return this.totalMonth; 
		
	}

	public void setTotalAmount(double total) {
		totalAmount = total;
	}

	public double getTotalAmount() {
		return totalAmount;
	}
	
	public void setRate(double rate) {
		
			this.rate = rate; 
		
	}
	
	public double getRate() {
		return this.rate; 
	}

	public void  printMonthlyPayment() {
		double monthlyPayment = (totalAmount + totalAmount * rate) / totalMonth;
		System.out.println("Your monthly payment is: " + monthlyPayment);
		
		
	}
	
	
	}


