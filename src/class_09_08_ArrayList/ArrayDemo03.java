package class_09_08_ArrayList;

import java.util.Arrays;

public class ArrayDemo03 {
	public static void main(String[] args) {
		
		String[] words  = {"Hello", "Good Morning", "Everyone", "I love Java", "I am SDET"};
	

		String[] filterArray = new String [3];
		
		
		for (int i=0;  i<words.length; i++) {
			
			if (words[i].equals("Good Morning")) {
				filterArray[0] = words[i];
				
			}
			else if (words[i].equals("Everyone")){
				filterArray[1] = words[i];
				
			}
			else if (words[i].equals("I am SDET")){
				filterArray[2] = words[i];
				
			}

		}
		System.out.println(Arrays.toString(filterArray));
		
	}
}
