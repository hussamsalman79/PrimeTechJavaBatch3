package class_10_03_Collections_02;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo_02 {
	public static void main(String[] args) {
		
		ArrayList<String> texts = new ArrayList<>(); 
		texts.add("Hello"); 
		texts.add("Hello"); 
		texts.add("Hi"); 
		texts.add("Hi"); 
		System.out.println(texts);
		
		HashSet<String> List = new HashSet<>(texts); 
		System.out.println(List);
		
	}

}
