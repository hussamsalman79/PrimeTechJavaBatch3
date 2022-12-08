package class_09_26_Polmorephism;

	public class MethodOverridingExample3 {

	public static void main(String[] args) {
		
		Person p1 = new English();
		p1.greet();
		Person p2 = new German();
		p2.greet();
		Person p3 = new French();
		p3.greet();
		Person p4 = new Person(); 
		p4.greet();
		
	}
}

	class Person{
		public void greet() {
			System.out.println("Greeting in different languages");
			
		}
	}
	
	class English extends Person{
		public void greet() {
			System.out.println("English");
			
		}
	}
	
	class German extends Person{
		public void greet() {
			System.out.println("German");
			
		}
	}
	class French extends Person{
		public void greet() {
			System.out.println("French");
			
		}
	}