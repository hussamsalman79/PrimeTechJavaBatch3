package Constructors;

public class Shirt {

	private String color;
	private char size;
	private String madeIn;
	private int count;

	Shirt(String newColor, char newSize,String newMade, int newCount ) {
		color = newColor;
		size = newSize;
		madeIn= newMade; 
		count = newCount;
	}

	
//	public String putOn() {
//		
//		if (color.equals("White")) {
//			System.out.println("This is the right shirt ");
//			
//		}
//		else {
//			System.out.println("Wrong Shirt");
//		}
//		return color;
//		
//	}

	public void printShirtInfo() {
		System.out.println("The color is: " + color);
		System.out.println("The size is: " + size);	
		System.out.println("Made in: " + madeIn);
		System.out.println("The count is: " + count);
	}

	
}
