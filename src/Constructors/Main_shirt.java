package Constructors;

public class Main_shirt {
	public static void main(String[] args) {
		
		Shirt s1= new Shirt("White", 'M', "China", 12); 
		Shirt s2 = new Shirt ("Black", 'L', "USA", 24); 
		Shirt s3 = new Shirt ("Red", 'S', "Canada", 32); 
		
		s1.printShirtInfo();
		System.out.println("-----------------------");
		s2.printShirtInfo();
		System.out.println("-----------------------");
		s3.printShirtInfo();
		
		
	}

}
