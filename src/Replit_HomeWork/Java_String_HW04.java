package Replit_HomeWork;

public class Java_String_HW04 {

	public static void main(String[] args) {

		String str = " I love Java! ";
		// ==> Find the index of character '!' using string method.
		int index = str.indexOf("!");
		System.out.println("Index of ! is :" + index);

		// Find the length of the str
		int length = str.length();
		System.out.println("The length of str is :" + length);

		// Convert the str to Lower Case using String method
		String lower = str.toLowerCase();
		System.out.println(lower);

		// Convert the str to Upper Case using String method
		String upper = str.toUpperCase();
		System.out.println(upper);

		// Remove all the space from the two end of the str using String method
		String trim = str.trim();
		System.out.println(trim);

		// Get the word 'love' from the str using subString() method of java
		String sub = str.substring(str.indexOf("l"), str.indexOf("J"));
		System.out.println(sub);

		// Create a new String that has value: 'I hate Java!' usings String methods
		String replace = str.replace("love", "hate");
		System.out.println(replace);

		// Find out which character is at index: 5 in str using String method
		char index1 = str.charAt(5);
		System.out.println("The character at index: 5 in is :" + index1);

		// Find the last index of character 'a' in str using string method
		int lastIndex = str.lastIndexOf("a");
		System.out.println(lastIndex);

		// ==> create another String with value: 'I am a java guru!' and compare it with
		// str to see if they are equals
		String str1 = "I am a java guru!";
		boolean result = str.equals(str1);
		System.out.println(result);

		// Check if str contains word:'Java' with java method.
		boolean isContains = str.contains("Java");
		System.out.println("Str contaisn java ==> " + isContains);

		// ==> checks if str starts with "I love" with java method
		boolean isStartsWith = str.startsWith("I love");
		System.out.println("Str starts with I love ==> " + isStartsWith);
		// ==> check if str ends with "java!" with java method
		boolean isEndsWith = str.endsWith("java!");
		System.out.println("str ends with java! ==> " + isEndsWith);
	}

}
