package class_09_26_Polmorephism;

public class MethodOverriddingExample {

	public static void main(String[] args) {
		Shape shape1 = new Circle1(); 
		shape1.draw();
		Shape shape2 = new Triangle1(); 
		shape2.draw();
		Shape shape3 = new Sequare(); 
		shape3.draw();
		

		

	}

}
	interface Shape{
		public void draw(); 
}
	class Circle1 implements Shape{
		//Override method
		public void draw() {
			System.out.println("Drawing Circle");			
		}
		
	}
	class Triangle1 implements Shape{
		//Override method
		public void draw() {
			System.out.println("Drawing Triangle");			
		}
		
	}
	
	class Sequare implements Shape{
		//Override method
		public void draw() {
			System.out.println("Drawing Sequare");			
		}
	}
	
	