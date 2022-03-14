package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

class has_itera {
	public static void main(String[] args) {
		// Creating a HashMap
		HashMap<String, Integer> numbers = new HashMap<>();
		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Three", 3);
//		System.out.println("HashMap: " + numbers);

		// Creating an object of Iterator
		Iterator<Entry<String, Integer>> it= numbers.entrySet().iterator();
		Iterator<Entry<String, Integer>> iterate1 = numbers.entrySet().iterator();

		// Accessing the Key/Value pair
//		System.out.print("Entries: ");
//		while (iterate1.hasNext()) {
//			System.out.print(iterate1.next());
//			System.out.print(", ");
//		}
		
		
		System.out.println("Entries  :  ");
		while (it.hasNext())
		{
			System.out.println(it.next()+", ");
		}

		// Accessing the key
		Iterator<String> iterate2 = numbers.keySet().iterator();
		System.out.print("\nKeys: ");
		while (iterate2.hasNext()) {
			System.out.print(iterate2.next());
			System.out.print(", ");
		}

		// Accessing the value
		Iterator<Integer> iterate3 = numbers.values().iterator();
		System.out.print("\nValues: ");
		while (iterate3.hasNext()) {
			System.out.print(iterate3.next());
			System.out.print(", ");
		}
	}
}