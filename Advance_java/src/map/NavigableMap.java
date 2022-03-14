package map;

import java.util.TreeMap;

public class NavigableMap {
	public static void main(String[] args) {
		TreeMap<Integer ,String> ss=new TreeMap<>();
		ss.put(1, "JIo");
		ss.put(02, "wipro");
		ss.put(3, "TCS");
		ss.putIfAbsent(5, "keysoft");
//		System.out.println(ss);
		System.out.println(ss.keySet());
		TreeMap< Integer,String> s = new TreeMap<>();
		s.put( -1,"Reliance");
		s.putAll(ss);
		 Object sd = s.get(2);
		 System.out.println(sd);
		System.out.println(s);
		

	}
}
