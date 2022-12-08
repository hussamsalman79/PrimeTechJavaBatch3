package Interface;

public class InterfaceExample02 {
	public static void main(String[] args) {
		
		MyiterfaceImp obj = new MyiterfaceImp(); 
		obj.printSMS("Printing !!!");
		obj.test();
		obj.sayHello();
		
	}

}

interface myInterface{
	 default void printSMS(String message) {
		System.out.println(message);
	}
	 
	 void test(); 
	 void sayHello();
}

class MyiterfaceImp implements myInterface{

	
	public void test() {
		
		
	}


	public void sayHello() {
	
		
	}
	
}