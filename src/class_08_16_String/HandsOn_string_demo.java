package class_08_16_String;

public class HandsOn_string_demo {

	public static void main(String[] args) {
		
		
		String str1 = "Java"; 
		String str2 = new String ("Java"); 
		boolean Reference= str1==str2; // checking the reference address to the string objects 
		System.out.println("Str1==Str2: " + Reference);		
		boolean Value = str1.equals(str2); // Compare the value of the string 
		System.out.println("Str1 equals to Str2: " + Value);
		
		String txt1 = "SAM"; 
		String txt2 = "sam"; 
		boolean result1 = txt1.equalsIgnoreCase(txt2);
		boolean result2 = txt1.equals(txt2);
		System.out.println("equalsIgnoreCase: " + result1);
		System.out.println("Equal: " + result2);
		
	}
}
