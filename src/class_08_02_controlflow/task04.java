package class_08_02_controlflow;

public class task04 {
	public static void main(String[] args) {

		int grade = 90;

		if (grade < 55) {
			System.out.println("Fail");
		} else if (grade >= 55 && grade < 80) {
			System.out.println("Pass");
		} else {
			System.out.println("Pass with honor");
		}
	}

}
