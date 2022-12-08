package class_10_20_JavaReview;

public class JavaReview {

	static String name = "Sam";
	int age = 50;
	final String lastName = "Karmah";

	final void print() {
		System.out.println(age);
	}

}

class child extends JavaReview {

}

class Constants {
	public static final String successMsg = "Info Submitted succssfully"; 
	public static final String failMsg = "Info Submitted failed"; 
}