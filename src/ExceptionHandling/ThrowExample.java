package ExceptionHandling;

public class ThrowExample {

	public static void main(String[] args) {

		divide2Numbers(10, 0);
		String str = "I love Java";
		String newStr = replaceWordInString(str, "Java", "C#");
		System.out.println(newStr);

	}

	public static void divide2Numbers(int a, int b) {
		if (a == 0 || b == 0) {
			throw new ArithmeticException("You can't divide a number with 0");
		}

		System.out.println(a / b);
	}

	public static String replaceWordInString(String str, String oldWord, String newWord) {
		if (str != null) {
			return str.replace(oldWord, newWord);
		} else {
			throw new NullPointerException("Your String can't be null");
		}
	}

}
