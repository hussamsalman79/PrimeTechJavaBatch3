package Interface;

public class MultipuleInheritance {

}

interface A{
	
	void methodA();
}

interface B {
	void methodB(); 
	void test();
}
// Inheriting multiple interfaces 
interface C extends B, A {
	void methodC();
	void test(); // this is will override the same method in interface B
}

class Imp implements C{

	
	public void methodB() {

	}

	public void methodC() {

	}


	public void test() {
				
	}

	public void methodA() {

	}
	
}