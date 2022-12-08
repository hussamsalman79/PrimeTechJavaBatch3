package ExceptionHandling;

public class TryCatchExample {

	public static void main(String[] args) {
	
//		try {
//		//throw new NullPointerException("Just throwing some exception");
//	} catch (Exception e) {
//		System.out.println("Inside Catch Block");
//	}
//	
//	System.out.println("Outside of catch block");
	
	
//	try {
//		System.out.println("Inside Try Block");
//		throw new NullPointerException("Just throwing some exception");
//	} finally {
//		System.out.println("Inside Finally Block");
//	}
	try {
		System.out.println(5 / 0);
	} catch (Exception e) {
		System.out.println("Cant devide a number with 0");
	}finally {
		System.out.println("I am a finally block");
	}

	}

}
