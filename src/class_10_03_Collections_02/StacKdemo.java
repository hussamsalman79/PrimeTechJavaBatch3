package class_10_03_Collections_02;

import java.util.Collections;
import java.util.Stack;

public class StacKdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> names = new Stack<>(); 
		
		names.push("Sam"); 
		names.push("Noora");
		names.push("Aws");
		names.push("Deema");
		System.out.println(names);
		System.out.println(names.pop());
		Collections.sort(names);
		System.out.println(names);
	}

}
