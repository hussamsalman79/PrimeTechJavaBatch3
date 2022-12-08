package class_09_08_ArrayList;

public class ArrayDemo05 {

	public static void main(String[] args) {
		
		String text = "I Love Java"; 
		String retext = ""; 
		
		System.out.println(text.length());
		
//		for (int i =text.length()-1; i>=0; i--) {
//			System.out.println(text.charAt(i));
//			 char c = text.charAt(i); 
//			 retext = retext + c; 
//			
//		}
//		System.out.println(retext);
//		
		
		// Solution 2 
		char [] arr = text.toCharArray(); 
		for (int i = arr.length-1; i>=0; i--) {
			
			retext = retext + arr[i]; 
		}
		
	System.out.println(retext);
		
	}

}
