package primetech.java.homepractice;
class Cars{
	
	String name = "Ford"; 
	
	public static void honk() {
		System.out.println("The car is honking");
	}
}



public class ObjectArray {
	public static void main(String[] args) {
		
		Cars c1 = new Cars(); 
		Cars c2 = new Cars(); 
		Cars c3 = new Cars(); 
		
		Cars [] myCars = {c1, c2, c3}; 
		
		for (Cars c : myCars) {
			Cars.honk();
		}
		
		
		
		
		
		
		
	}

}
