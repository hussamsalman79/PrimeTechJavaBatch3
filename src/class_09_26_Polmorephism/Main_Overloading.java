package class_09_26_Polmorephism;

public class Main_Overloading {
	
	public static void main(String[] args) {
		
		
		Overloading num = new Overloading(); 
		num.multiply(5);
		num.multiply(3, 4);
		num.multiply(0.5, 1.7);
		System.out.println("-------------");
		num.sum(10, 30);
		num.sum(1.5, 2.5);
		num.sum(5, 10, 15, 5);
		
		
	}
}
