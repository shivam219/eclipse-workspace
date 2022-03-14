package map;
import java.util.Hashtable;
import java.util.LinkedHashMap;

public class Hash_linked {

	
	
	    public static void main(String[] args) {
	        // Creating a LinkedHashMap of even numbers
	        LinkedHashMap<String, Integer> evenNumbers = new LinkedHashMap<>();
	        evenNumbers.put("Two", null);
	        evenNumbers.put("Four", null);
	        System.out.println("LinkedHashMap1: " + evenNumbers);

	        // Creating a LinkedHashMap from other LinkedHashMap
	        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>(evenNumbers);//direct share value 
	        numbers.put("Three", 3);
	        System.out.println("LinkedHashMap2: " + numbers);
	        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
	        ht.put(10, 10);
	    }
}
