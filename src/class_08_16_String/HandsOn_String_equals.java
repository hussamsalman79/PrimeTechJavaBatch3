package class_08_16_String;

public class HandsOn_String_equals {

	public static void main(String[] args) {
		
		String txt1 = "Hello My Name Is Muneer"; 
		String txt2 = "hello My name Is MUneer"; 
		System.out.println(txt1.equals(txt2));
		System.out.println(txt1.equalsIgnoreCase(txt2));
		
		// Trim method =====> trim();
		// Will remove all the spaces from the two ends of the string
		String name = "    Hello my name is Sam    "; 
		name =name.trim(); 
		System.out.println(name);
		
		// Contain method =====> contains()
		// Checks if the string contains specific characters 
		boolean cont = name.contains("Sam"); 
		System.out.println(cont);
		
		// Empty method ====> isEmpty(); 
		//check if the string is empty and will return a boolean value true or false
		String txt3 ="  "; 
		boolean check = txt3.isEmpty(); // Spaces considers characters, so it is not empty
		boolean check2 = txt3.isBlank(); // Spaces considers white space, so it is blank
		System.out.println("String is Empty: " + check);
		System.out.println("String is Blank: " + check2);
	
		// concat method ===> concat(); 
		// Adding more texts or new string to the existing String 
		String Words = "Welcome"; 
		String NewWords = Words.concat(" Sam"); 
		System.out.println(NewWords);
		
		//startWith method 
		//endsWith method
		String word = "Welcome to the FaceBook!";
		boolean check3 = word.startsWith("Welcome"); 
		System.out.println("String starts with Welcome: " + check3);
		boolean check4 = word.endsWith("FaceBook!"); 
		System.out.println("Ends with FaceBook!: " + check4);
		
		//ReplaceFirst method 
		String text = "I love Java, I am a Java Guru"; 
		String newtxt = text.replace("Java", "JavaScript");
		System.out.println(newtxt);
		String newtxt2 = text.replaceFirst("Java", "C#"); 
		System.out.println(newtxt2);
		
	}

}
