package class_10_10_Collections_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Iterating_HashMap {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap <>(); 
		map.put("name", "Sam"); 
		map.put("DOB", "11.25.1979"); 
		map.put("Gender", "Male"); 
		map.put("Age", "43");
		
		Set<Entry<String,String>> looping = map.entrySet(); 
		for(Entry<String,String> entry:looping) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println("-----------------------");
		Iterator<Entry<String,String>> it = looping.iterator(); 
		while(it.hasNext()) {
			Entry<String,String> ent=it.next(); 
			System.out.println(ent.getKey() + ":" + ent.getValue());
		}
		
	}

}
