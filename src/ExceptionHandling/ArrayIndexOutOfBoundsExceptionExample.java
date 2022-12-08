package ExceptionHandling;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {

		int[] arr = { 1, 5, 4 };
		try {
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			// System.out.println(arr[3]);// out of range
		} catch (Exception ex) {
			System.out.println("Please use proper index to print the value of the Array");
		} finally {
			System.out.println("This is Finally Blocked");
		}

	}

}
