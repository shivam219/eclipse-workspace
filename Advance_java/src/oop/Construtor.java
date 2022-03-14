package oop;

public class Construtor {
	public static void main(String[] args) {
//		String s= new String ();
//		String s1= new String("abc");// create a string literals 
//  	with some argument under the heap area.
//		String s = new String (StringBuffer sb);

//		char [] ch = {'a','b','s'};
//		String strchar= new String (ch);
//		

//		type byte in str class
//		byte [] bytee= {101,102,103};// 127
//		String ss= new String (bytee);
//		System.out.println(ss);

//	 method of string class:-
//		 String sss= new String("abcdef");
//		 System.out.println(s.charAt(0));
//		 System.out.println(s.charAt(2));
//		
//		 
//		 

//		 3) compare str public boolean equals(object o)
		String com = new String("java");
		System.out.println(com.equals("java"));
//		content comparison
		System.out.println(com.equalsIgnoreCase("JAva"));
		
//		 substring 
		System.out.println(com.substring(0,3
				));

	}
}
