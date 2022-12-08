package class_08_02_controlflow;

public class subjectTask {

	public static void main(String[] args) {

		int Math = 55;
		int English = 90;
		int Chemistry = 84;

		int average = (Math + English + Chemistry) / 3;

		if (average >= 0 && average <=59) {
			System.out.println("avarage = F");
		} else if (average >= 60 && average <= 69) {
			System.out.println("avarage = D");
		} else if (average >= 70 && average <= 79) {
			System.out.println("avarage = C");
		} else if (average >= 80 && average <= 89) {
			System.out.println("average = B");
		} else {
			System.out.println("average = A");
		}

	}
}
