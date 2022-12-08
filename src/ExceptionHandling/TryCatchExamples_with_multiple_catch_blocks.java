package ExceptionHandling;

public class TryCatchExamples_with_multiple_catch_blocks {

	public static void main(String[] args) {
		int[] original  = {1,1,5};
		try {
			int[] arr = original;
			arr[2] = arr[0] / arr[1];
			String name = null;
			System.out.println(name.indexOf("d"));
		}catch (ArithmeticException e) {
			System.out.println("Can't devide the number with 0");
		}//catch(ArrayIndexOutOfBoundsExceptionExample ex) {
			System.out.println("Array index is outside of its boundry");
		}//catch(Exception ex) {
			//System.out.println("Some other exception");
	//	}

	}

//}
