package class_08_02_controlflow;

public class ElseifStatement {
	public static void main(String[] args) {
		
		int a = 5; 
		int b = 3; 
		int c = 6; 
		int d = 4; 
		
		
		if (a< b && a < c && a < d ) {
			System.out.println(" This the smalleast number a = " + a );
		}
		else if (b < c && b < d ) {
			System.out.println(" This the smalleast number b = " + b );
		}
		else if (c < d ) {
			System.out.println(" This the smalleast number c = " + c );
		}
		else { 
			System.out.println(" This the smalleast number d = " + d );
		}	
		
	}

}
