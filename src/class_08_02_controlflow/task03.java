package class_08_02_controlflow;

public class task03 {

	public static void main(String[] args) {

		int time = 14;

		if ((time >= 12 && time < 14) || time >= 17) {

			if (time >= 12 && time < 14) {
				System.out.println("Lunch Time");

			} else {
				System.out.println("Dinner Time");
			}
		} else {
			System.out.println("Brakefast time ");
		}
	}

}
