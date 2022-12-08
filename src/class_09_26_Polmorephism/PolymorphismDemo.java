package class_09_26_Polmorephism;

public class PolymorphismDemo {

	public static void main(String[] args) {
		Shapes shape1 = new Circle(); 
		Shapes shape2 = new Triangle(); 
		Shapes shape = new Shapes(); 
		shape1.area();
		shape2.area();
		shape.area();
		
	}

}

	class Shapes {
		public void area() {
			System.out.println("Area of shapes........");
		}
	}
	
	class Circle extends Shapes{
		public void area() {
			System.out.println("Area of Circle: 3.14 * radius * radius");
			
		}
		
	}
	
	class Triangle extends Shapes{
		public void area() {
			System.out.println("Area of Triangle: 1/2 * base * height");
			
		}
		
	}
