package class_09_26_Polmorephism;

public class Overloading {

	public  void multiply(int a) {
		System.out.println(a*a);
	}
	
	public void multiply(int c, int d) {
		System.out.println(c*d);
	}
	
	public  void multiply(double e, double f) {
		System.out.println(e*f);
	}
	public  void sum (int a, int b) {
		System.out.println(a+b);
	}
	public  void sum (double a, double b) {
		System.out.println(a+b);
	}
	public  void sum (int f, int r, int g, int n) {
		System.out.println(f+r+g-n);
	}
}



