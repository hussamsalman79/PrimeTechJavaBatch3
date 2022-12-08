package Class_Methods_java;

public class methods {
	public static void main(String[] args) {
		
		welcome(); 
		multiply (5, 10);
		multiply (6, 10);
		multiply (7, 10);
		multiply (8, 10);
		divide(100, 10); 
		divide(100, 20); 
		divide(100, 50); 
		divide(100, 25); 
	}
	public static void welcome() {
		System.out.println("Welcome to our calculation !!!");
	}
	public static void multiply (int a, int b ) {
		System.out.println(a*b);
	}
	public static void divide (int a, int b) {
		System.out.println(a/b);
	}
}
