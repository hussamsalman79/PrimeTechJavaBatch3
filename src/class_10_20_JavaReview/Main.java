package class_10_20_JavaReview;

public class Main {

	public static void main(String[] args) {

		String Name = JavaReview.name;
		System.out.println(Name);// we can access name using the class name because it is static

		JavaReview obj = new JavaReview(); // We need to create object to access age because it is not static

		System.out.println(obj.age);

		String txt = "I love Jave"; // String is immutable
		txt.replace("Java", "JavaScript");
		System.out.println(txt);

		child obj1 = new child(); // child class Inherited print method from JavaReview class
		obj1.print();
		// fianl static keyword used with method in JavaReview Class: 
		boolean Pass = true; 
		if(Pass) {
			System.out.println(Constants.successMsg);
		}
		
		else {
			System.out.println(Constants.failMsg);
		}
		

	}

}
