package Inherit;

public class Mouse_main {
	
	public static void main(String[] args) {
		
		Mouse1 m1= new Mouse1(); 
		m1.setColor();
		
		m1.leftClick();
		m1.rightClick();
		
		System.out.println("=====================");
		
		Mouse2 m2 = new Mouse2(); 
		
		m2.setsize();
		m2.scrollUp();
		m2.scrollDown();
		
		
	}

}
