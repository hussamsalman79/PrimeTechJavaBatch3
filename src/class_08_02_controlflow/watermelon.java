package class_08_02_controlflow;

public class watermelon {
	public static void main(String[] args) {

		int students = 77;

		boolean teacherMood = false;

		if (students >= 50) {
			System.out.println("Full house");
			teacherMood = true;
		}

		if (students < 50) {
			System.out.println("We have absence");
			teacherMood = false;
		}

		if (teacherMood == true) {

			System.out.println("Teacher is Happy");
		}

		if (teacherMood == false) {

			System.out.println("Teacher is not Happy");
		}

	}

}
