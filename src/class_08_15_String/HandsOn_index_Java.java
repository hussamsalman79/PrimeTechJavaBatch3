package class_08_15_String;

import java.util.Scanner;

public class HandsOn_index_Java {
	public static void main(String[] args) {

		// The place of the letter in memory (index)
		// space will take a spot as well as index
		//Example 01: 
		
		String txt = " I love Java";
		int index = txt.indexOf("a");
		int index1 = txt.lastIndexOf("a");
		System.out.println(index);
		System.out.println(index1);
		
		//Example02: 
		String text = "I am the best Java Developer";
		int Index = text.indexOf("I"); 
		int Index2= text.indexOf("J"); 
		int Index3= text.indexOf("D"); 
		System.out.println(Index);
		System.out.println(Index2);
		System.out.println(Index3);
		
		//length() Method
		// Length method: Give us the how long the word is
		//Example 01: 
		String word = "Java is easy to learn";
		System.out.println(word.length());
		
		//Example 02: 
		String name = "I am student at PrimeTech School in Fairfax VA";
		int length = name.length()-1;
		System.out.println(length);
		System.out.println(word.charAt(word.length()-1));
		
		//charAt() Method
		//Example:  
		String text01 = "I am the best Java Developer";
		char pos1 = text01.charAt(0); 
		System.out.println(pos1);
		char pos2 = text01.charAt(14); 
		System.out.println(pos2);
		char pos3 = text01.charAt(19); 
		System.out.println(pos3);
		
		//toUpperCase() and toLowerCase() Methods
		//Example
		String name1 = "hello"; 
		String upper = name1.toUpperCase();
		String lower = name1.toLowerCase();
		System.out.println(upper);
		System.out.println(lower);
		
		//subString(number) Method
		//Example: 
		String wording = "My Name is Sam Karmah"; 
		int Sindex = wording.indexOf("S"); 
		System.out.println(wording.substring(Sindex));
		
		//Warm up examples:
		String text1 = "My name is Polat"; 
		int index11 = text1.indexOf("P");
		System.out.println(index11);
		String name11 = text.substring(index11);
		System.out.println(name11);	
	}

}
