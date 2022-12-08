package primetech.java.homepractice;

public class Java_PolyMorphism_partice {

	public static void main(String[] args) {
		
		NewShapes myShape = new NewShapes(); 
		myShape.area();
		NewShapes shape1 = new Square(); 
		shape1.area();
		NewShapes shape2 = new Rectangle(); 
		shape2.area();
	}

}

