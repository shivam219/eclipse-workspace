package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class map_class {
	public static <k,v> void main(String[] args) {

		HashMap<Integer ,Integer> hm = new HashMap<Integer, Integer>();
		
		hm.put(1, 10);
		hm.put(2, 20);
		hm.put(3, 30);
		System.out.println(hm.replace(2, 50));
		System.out.println(hm);
		LinkedHashMap<k,v> a = new LinkedHashMap<k,v>();
		System.out.println(a);
		TreeMap<k,v> aa = new TreeMap<k, v>();
//		System.out.println(aa.);
		Hashtable<k, v>  h = new Hashtable<k, v>();
		System.out.println(h);
		
//		System.out.println(hm.);
//		TreeMap<K, V>
	}
}
