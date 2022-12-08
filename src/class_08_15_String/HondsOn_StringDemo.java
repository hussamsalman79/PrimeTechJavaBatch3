package class_08_15_String;

public class HondsOn_StringDemo {
	public static void main(String[] args) {
	
		String str1 = "Sam"; 
		String str2 = "Sam";
		String str3 = "sam";
		// Compare the reference or address 
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		//Compare the value 
		String str5= new String("Sam"); 
		String str6= new String("Sam"); 
		
		System.out.println(str5.equals(str6));
			
	}

	
	

	

}
