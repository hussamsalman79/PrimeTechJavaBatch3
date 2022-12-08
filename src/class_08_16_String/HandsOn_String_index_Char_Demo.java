package class_08_16_String;

public class HandsOn_String_index_Char_Demo {
	public static void main(String[] args) {
		
		
		String txt = "Hello World, I love this World!"; 
		int index =  txt.indexOf("World!"); 
		System.out.println(index);
		String str = txt.substring(index); 
		System.out.println(str);
		
		// SubString (int startIndex, int endIndex)
		int startIndex = txt.indexOf("love");
		int endIndex = startIndex + 4; 
		System.out.println("Start Index: " + startIndex);
		System.out.println("End Index: " + endIndex);
		
		String str1 = txt.substring(15,19); 
		System.out.println(str1);
		
		
		
	}

}
