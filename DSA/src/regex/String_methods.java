package regex;

import java.util.Arrays;

public class String_methods {
	public static void main(String[] args) {
		
		String s = "ab";
		System.out.println("aa".compareTo("ab"));
		String name = "		shivam   kumar  qqqqqqqqqq 				";
		System.out.println((name = name.strip() )+ " sv");
//		System.out.println(name.replaceAll("\\s", "."));
		System.out.println(name.replace("s", "."));
		
		String[] ch = name.split("[a-zA-z]");
		
		char [] data = {'s','d','e','d','h'};
		String d = String.valueOf(data,1,2);
		System.out.println(d);
		String  s1 = s.substring(0, 1);
	}
}
