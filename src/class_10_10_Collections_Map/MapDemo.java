package class_10_10_Collections_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> students = new HashMap <>(); 
		students.put(1, "Munner"); 
		students.put(2, "Sam"); 
		students.put(3, "Amro"); 
		students.put(4, "Mohammed"); 
		students.put(5, "Supkan"); 
		System.out.println(students);
		
		// Allow overrode when entering duplicate key, will replace the old with new entered value
		students.put(1, "Marwan");
		System.out.println(students);
		
		HashMap <Integer, String> students2 = new HashMap<>();
		students2.put(1, "Alina"); 
		students2.put(2, "Mutlu"); 
		students2.put(3, "Marci"); 
		System.out.println(students2);
		students.putAll(students2);// will replace the values with map
		System.out.println(students);
		
		// contain method
		System.out.println(students.containsKey(3));
		System.out.println(students.containsKey(7));
		
		//get method to return a specific value of the hashmap 
		String value1 = students.get(1); 
		System.out.println(value1);

		// isEmpty method will return true or false
		System.out.println(	students.isEmpty());
		// will return the keys of the map
		Set<Integer> keys = students.keySet();
		System.out.println(keys);
		// for each loop
		for (Integer key:keys) {
			System.out.println(key + "= " + students.get(key));
		}
		// int size 
		int size= students.size(); 
		System.out.println(size);
		//Collection unique values(); 
		Collection<String> values = students.values(); 
		System.out.println(values);
		//Removing the duplication
		Set<String>uniqueV= new HashSet<String>(values);
		System.out.println(uniqueV);
		
		// For loop using Entry method 
		// 1st we need to set Entry Set 
		Set<Entry<Integer, String>> ent = students.entrySet(); 
		
		for (Entry<Integer, String> entry:ent) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		

	}


}
