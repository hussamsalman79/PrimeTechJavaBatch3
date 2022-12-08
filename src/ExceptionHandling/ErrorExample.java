package ExceptionHandling;

public class ErrorExample {
	static int recursionCount = 0;
	public static void main(String[] args) {
		
		print(10); 
		
		
	}
	public static void print(int number) {
//		if(recursionCount==5) {
//		return;
//	}
	System.out.println(number);
	//recursionCount++;
	print(number);
		// calling same method inside the same method, it is call recursion 
		// Will keep printing the number until stack memory overflow
		//print(number); 
	}

}
