package primetech.java.homepractice;

public class NewShapes{
	public void area() {
		System.out.println("Calculating the Area of different shapes");
	}
}

class Square extends NewShapes{
	double side =7; 
	double area; 
	public void area() {
		
		area = side * side; 
		System.out.println("The area of sequare is:  " + area );
	}
	
}

class Rectangle extends NewShapes{
	double length =10; 
	double width = 5; 
	double area; 
	public void area() {
		
		area = length * width; 
		System.out.println("The area of sequare is:  " + area );
	}
	
}