package JavaReview;

public class SwapNumbers {
	
	public static void main(String[] args) {
		// Swapping 2 numbers with using a third varaible
		int num1 = 10; 
		int num2 = 15; 
		
		int temp =  num1;
		num1 = num2;   
		num2 = temp; 
		   
	   System.out.println("num1 = " + num1);
       System.out.println("num2 = " + num2);
       
       
       // Swapping Strings without using a third variable
       String a = "Hello";
       String b = "Good morning";
        
       // Print String before swapping
       System.out.println("Strings before swap: a = " +
                                      a + " and b = "+b);
       // append 2nd string to 1st
       a = a + b;
    
       // store initial string a in string b
       b = a.substring(0,a.length()-b.length());
        
       // store initial string b in string a
       a = a.substring(b.length());
        
       // print String after swapping
       System.out.println("Strings after swap: a = " +
                                    a + " and b = " + b);
       
       // Swapping Two numbers without a third variable 
       
       int x = 20; 
       int y = 30;
       // Code to swap 'x' and 'y'
       x = x + y; // x now becomes 50
       y = x - y; // y becomes 20
       x = x - y; // x becomes 30
      
       System.out.println("x=" + x);
       System.out.println("y=" + y);
	}

}
