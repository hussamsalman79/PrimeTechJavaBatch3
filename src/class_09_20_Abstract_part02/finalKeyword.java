package class_09_20_Abstract_part02;

public class finalKeyword {
	
	static final int number = 456; // we cannot change it 
	
	public static void main(String[] args) {
		
		System.out.println(finalKeyword.number);
		
	}

}

class A {
	public void test() {
		System.out.println("Class A test");
	}
}

class B extends A {
	public void test() {
		System.out.println("Class B test");
	}
}