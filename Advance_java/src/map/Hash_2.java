package map;
import java.util.*;
import java.util.Map.Entry;
public class Hash_2 {
	  public static void main(String[] args) {

	        // Creating a HashMap
	        HashMap<String, Integer> numbers = new HashMap<>();
	        numbers.put("One", 1);
	        numbers.put("Two", 2);
	        numbers.put("Three", 3);
	        System.out.println("HashMap: " + numbers);

	        // Accessing the key/value pair
	        System.out.print("Entries: ");
	        for(Entry<String, Integer> entry: numbers.entrySet()) {
	            System.out.print(entry+", ");
	         
	        }

	       
	        System.out.print("\nKeys: ");
	        for(String key: numbers.keySet()) {
	            System.out.print(key);
	            System.out.print(", ");
	        }

	        // Accessing the value
	        System.out.print("\nValues: ");
	        for(Integer value: numbers.values()) {
	            System.out.print(value);
	            System.out.print(", ");
	        }
	    }
}
								