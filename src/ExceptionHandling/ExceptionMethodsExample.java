package ExceptionHandling;

public class ExceptionMethodsExample {

	public static void main(String[] args) {
		try {
			//throw new ArrayIndexOutOfBoundsExceptionExample("Exception thrown by me");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
