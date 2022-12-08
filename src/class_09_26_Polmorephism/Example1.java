package class_09_26_Polmorephism;

public class Example1 {

	public static void main(String[] args) {
		
		display(2022); 
		display("Sam Karmah"); 
		display();
		display(10);
		display(20, "Hello");
		display("Hello", "world");
		
	}
	/// Because the static keyword, then we can call the method without creating any object
	public static void display(int data) {
		System.out.println("Displaying Integer Data: " + data);
	}
	public static void display(String data) {
		System.out.println("Displaying String Data: " + data);
	}
	public static void display() {
		System.out.println("Displaying empty Data");
	}
	public static void display(String data1, String data2) {
		System.out.println("Displaying string data after adding 2 strings " + data1 + " "+data2);
	}
	public static void display(String text, int num) {
		System.out.println("Displaying text " + text + " and Number " + num);
	}
	public static void display(int num, String text) {
		System.out.println("Displaying number " + num + " and String text " + text);
	}
	
	

}
