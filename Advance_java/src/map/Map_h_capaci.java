package map;

import java.util.HashMap;
import java.util.Map;

public class Map_h_capaci {
	public static void main(String[] args) {
		Map<Integer, String> aa = new HashMap<>(10, 5);
		aa.put(1, "shiva");
		aa.put(2, "anil");
		aa.put(3, "mukesh");
		aa.put(4, "aman");
		aa.putIfAbsent(6, "Ramkali"); // In hash map value is arrange by key ascending order
		System.out.println(aa.entrySet());
		
		boolean get=aa.replace(4, "aman", "amit"); ///change value directly by key old value
		System.out.println(aa+"\n"+get);
	
	    System.out.println("New HashMap: " + aa);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		System.out.println(aa.keySet());
//		System.out.println(aa.values());
//		
//		boolean check =aa.remove(3, "anil");
//		
//		System.out.println("2 value is remove :- "+check);
//		

//		Map<Integer, String> a=new HashMap<>();
//		a.putAll(aa);
//		System.out.println(a);
//		aa.putAll(aa);
//		System.out.println(aa);
//		String ss = aa.replace(2, "Rama"); // return value of removable object
//		System.out.println(ss);
//		ss=aa.getOrDefault(10, "yellow");
//		System.out.println(ss);
//		System.out.println(aa);

	}
}
