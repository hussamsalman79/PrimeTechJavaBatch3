package class_08_01_operators;

public class HandsOn2 {
	public static void main(String[] args) {
		int b = 2; 
		boolean res = ++b == 2 || --b ==2 && --b ==2;  
		System.out.println(res);	
		
		boolean x = true, z = true; 
		int y = 20; 
		x = (y!=10) || (z=false); 
		System.out.println(x);
		System.out.println(z);
	}

}
