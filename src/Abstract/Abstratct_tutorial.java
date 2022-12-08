package Abstract;

abstract class Soil {

	String name = "Scotts";
	String type = "Lawn Soil";

	public void plant() {
		System.out.println("Best soil for grass is: " + name + " " + type);
		
	}
	
	public void StoreService() {
	String team = "Merchindisers";
	String action = "Service";
	System.out.println("Home Depot & Lowes " + team + " " + action);
		
	}
	public abstract void shipping();// abstract method without a code in a curly braces
	public abstract void buyback(); 
}

// Extended class from the main abstract class (Soil)
class Scotts extends Soil {
	// implement the abstract method
	public void shipping() {
		System.out.println("Scotts handls the shipments to any store");
	}
	
	public void buyback() {
		System.out.println("Scotts team handle the buyback process");
	}

}

public class Abstratct_tutorial {
	public static void main(String[] args) {

		Soil MG = new Scotts();
		MG.plant();
		MG.shipping();
		MG.StoreService();
		MG.buyback();

	}

}
