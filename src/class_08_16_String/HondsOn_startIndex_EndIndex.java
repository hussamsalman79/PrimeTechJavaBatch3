package class_08_16_String;

public class HondsOn_startIndex_EndIndex {

	public static void main(String[] args) {
		
		//Example 01:
		String txt = "I love Java"; 
		int start = txt.indexOf("love");
		int end = txt.indexOf("e")+1; 
		System.out.println(start);
		System.out.println(end);
		String str = txt.substring(start, end); 
		System.out.println(str);
		
		//Example 02:
		String sentence = "I love java, java is so fun and easy!"; 
		int start1 = sentence.indexOf("fun"); 
		int end1 = sentence.indexOf("n") +1; 
		String str1 = sentence.substring(start1, end1); 
		System.out.println(str1);
		
		// Replace method 
		String word = "Java"; 
		String rep = word.replace("J","C"); 
		System.out.println("Before replece: " + word);
		System.out.println("After replece: " + rep);
		
		// Replace full name with actual name 
		String wel = "Welcome fullname to the class"; 
		String rep1 = wel.replace("fullname", "Sam Karmah"); 
		System.out.println(rep1);
		
		String word1 = "I hate Java"; 
		word1 = word1.replace("hate", "love"); 
		System.out.println(word1);
	}

}
