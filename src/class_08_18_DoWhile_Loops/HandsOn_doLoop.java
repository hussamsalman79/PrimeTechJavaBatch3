package class_08_18_DoWhile_Loops;

public class HandsOn_doLoop {

	public static void main(String[] args) {

		int sum = 0;
		int num = 2;

		while (num <= 20) {
			if (num % 2 == 0) {
			System.out.println(sum + " + " + num + " = " + (sum + num));
			sum = sum + num;
			}
			num++;
		}
	}
}
