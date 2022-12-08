package class_09_08_ArrayList;

import java.util.Arrays;

public class ArrayDemo01 {
	public static void main(String[] args) {

		String [] words = {"Good morning", "I am", "SDET"}; 
		String [] filter = new String [3]; 
		
		for (int i =0; i<words.length; i++) {
			
			filter[i]=words[i]; 	
		}
		System.out.println(Arrays.toString(filter));
		
		
		String text = "I lover Java";
		String rev =""; 
		
		for ( int r=text.length()-1; r>=0; r--) {
			
			char c = text.charAt(r); 
			
			rev = rev +c; 
			
		}
		System.out.println(rev);
		
		/* Task:
		 * Giving below String
		 * 	String text = "Hello";
		 * ==> convert the text String into array of char
		 * ==> reverse the String
		 * 
		 * 
		 */
		
		
		String text2 ="Hello"; 
		
		char [] hello = new char[5]; 
		
		for (int n = text2.length()-1; n>=0; n--) {
			
			 hello[n] =  text2.charAt(n); 
			
			
		}
		
		System.out.println(Arrays.toString(hello));
		
		
	
			 
		
		
	}

}
