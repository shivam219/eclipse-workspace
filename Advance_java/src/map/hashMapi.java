package map;
import java.util.HashMap;
import java.util.Hashtable;
public class hashMapi {
	public static void main(String[] args) {
		HashMap<String , Integer> map = new HashMap<String, Integer>();
		map.put("rama", 1000);
		map.put("Shivam", 20);
		map.put("deepak", 30);
		map.put("suraj", 40);
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		ht.put("rama", 1000);
		ht.put("Shivam", 20);
		ht.put("deepak", 30);
		ht.put("deepak", 30);
		System.out.println(ht);
		System.out.println(System.getProperty("java.home"));
	}
}