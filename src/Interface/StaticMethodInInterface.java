package Interface;

public class StaticMethodInInterface {
	public static void main(String[] args) {
		String  message = MyInterface2.getMessage();
		System.out.println(message);
		MyInterface2.printMessage("This is a message");
		
	}
}

interface MyInterface2{
	
	
	void print();
	
	default void greeting() {
		System.out.println("Hello");
	}
	
	static String getMessage() {
		return "Hello this is static method";
	}
	
	static void sayHello() {
		System.out.println("Hello");
	}
	static void printMessage(String message) {
		System.out.println(message);
	}
	
}


