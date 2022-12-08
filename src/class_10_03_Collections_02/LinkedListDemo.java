package class_10_03_Collections_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListDemo {
	public static void main(String[] args) {
		// Create Linked List: 
		LinkedList <Integer> nums = new LinkedList<>(); 
		nums.add(5); 
		nums.add(2);
		nums.add(1);
		nums.add(4);
		nums.add(3);
		System.out.println(nums);
		nums.sort(null);// will sort with Ascending order
		System.out.println(nums);
		nums.addFirst(0);
		System.out.println(nums);
		ArrayList <Integer> nums2 = new ArrayList<>(); 
		nums2.add(10); 
		nums2.add(20); 
		nums.addAll(nums2);// Adding nums2 array to the linked list array nums
		System.out.println(nums);
		ArrayList <Integer> nums3 = new ArrayList<>(); 
		nums3.add(25); 
		nums3.add(15);
		nums.addAll(nums3); 
		System.out.println(nums);
		nums.sort(null);
		System.out.println(nums);
		nums.remove(); // Will remove the head (1st element) of the Link List
		System.out.println(nums);
		nums.remove(6); // Remove by index number 
		System.out.println(nums);
		nums.removeLast(); // will remove the last element in the linked list
		System.out.println(nums);
		// using nums.poll();  will remove the 1st element and we can print it 
		Integer itemRemoved = nums.poll();
		System.out.println("1st element in the Linked List: " + itemRemoved);
		System.out.println(nums);
		System.out.println(nums.contains(20));// to check for specific element in the list
		System.out.println(nums.contains(22));
		System.out.println(nums.getFirst());
		System.out.println(nums.getLast());
		System.out.println(nums.size());// size of the list 
		System.out.println(nums);
		Iterator<Integer> it = nums.iterator(); // Loop through the Linked List using Iterator
		while (it.hasNext()) {
			System.out.print(it.next()+ ",");
			
		for (Integer numbers : nums) { // usign for each loop
			System.out.println(numbers);
		}
		for (int i=0; i<nums.size(); i++) {
			System.out.println(nums.get(i));
		}
		Collections.sort(nums, Collections.reverseOrder());
		System.out.println("After Reverse Order: " + nums);
		}
	}

}
