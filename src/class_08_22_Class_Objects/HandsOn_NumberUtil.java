package class_08_22_Class_Objects;

public class HandsOn_NumberUtil {

	public static void main(String[] args) {
		
		NumberUtils Number = new NumberUtils(); 
		
		int max = Number.getMax(10, 15); 
		System.out.println(max);
		int max2 = Number.getMax(11, 22); 
		System.out.println(max2);
		int max3 = Number.getMax(100, 220); 
		System.out.println(max3);
		
		
		

	}

}
