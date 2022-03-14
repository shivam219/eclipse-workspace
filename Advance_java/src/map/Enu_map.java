package map;

import java.util.EnumMap;

public class Enu_map {
	enum Jio {
		SMALL, MEDIUM, LARGE, EXTRALARGE //this is main variable with integer.
	}

	public static void main(String[] args) {
		EnumMap<Jio, Integer> s= new EnumMap<>(Jio.class);///extends jio upper class
		s.put(Jio.SMALL,10);
		s.put(Jio.MEDIUM,20);
		s.put(Jio.LARGE,30);
		s.put(Jio.EXTRALARGE,40);
		int no=s.remove(Jio.LARGE);
		 boolean result = s.remove(Jio.SMALL, 28);
		 System.out.println(result);
		 System.out.println(no);
		 
		System.out.println(s);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println(s.keySet());
////		System.out.println(s.values());
//		int num=s.get(Jio.SMALL);
//		System.out.println(num);
//		EnumMap<Jio,Integer>ss=new EnumMap<>(Jio.class);
//		ss.putAll(s);
//		ss.put(Jio.SMALL, 05);
//	    System.out.println(ss);
		
		
	}
}
