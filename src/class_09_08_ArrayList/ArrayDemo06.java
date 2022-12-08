package class_09_08_ArrayList;

public class ArrayDemo06 {
	
	public static void main(String[] args) {
		
		
		String text = "Hello"; 
		String reverse = ""; 
		
		char [] arr = text.toCharArray(); 
		
		for (int i =arr.length-1;  i>=0; i--) {
			
			reverse  = reverse + arr[i]; 
		}	
		System.out.println(reverse);
	}

}
