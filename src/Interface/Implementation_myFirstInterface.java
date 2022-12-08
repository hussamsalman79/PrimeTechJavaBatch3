package Interface;

public class Implementation_myFirstInterface implements myFirstInterface {

	
	public void sayHello() {		
		System.out.println("Hello PrimeTech Students");
	}

	public void sayGoodby() {
		System.out.println("See you next time ");
		
		
	}
	
	public void sayGoodNight() {
		System.out.println("Have a good night everyone");
	}
	
	
	

	
	public static void main(String[] args) {
		
		myFirstInterface obj = new Implementation_myFirstInterface(); 
		
		obj.sayHello();
		obj.sayGoodby();
		obj.sayGoodNight();
		
	}
	

}
