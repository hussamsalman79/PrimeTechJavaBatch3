package primetech.java.homepractice;

public class replit_homework_07 {
	public static void main(String[] args) {

		String str = " I love Java! ";

		int index = str.indexOf("!");
		System.out.println(index);

		int length = str.length();
		System.out.println(length);

		String lower = str.toLowerCase();
		System.out.println(lower);

		String upper = str.toUpperCase();
		System.out.println(upper);
		
		String trim = str.trim(); 
		System.out.println(trim);

		int index11 = str.indexOf("love");
		int index12 = str.indexOf("e")+1; 
		String result = str.substring(index11, index12); 
		System.out.println(result);
	
		String replce = str.replace("love", "hate");
		System.out.println(replce);
		
		char pos = replce.charAt(5);
		System.out.println(pos);

		int index1 = replce.lastIndexOf("a");
		System.out.println(index1);

		String text = "I am a Java guru";

		System.out.println(text == str);
		System.out.println(text.equals(str));
		System.out.println(str.contains("Java"));
		System.out.println(str.startsWith("I love"));
		System.out.println(str.endsWith("Java!"));

	}

}
