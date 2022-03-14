package java_TEch;

import java.util.Arrays;
import java.util.stream.IntStream;

public class String_fuciton {
	public static void main(String[] args) {
//		byte [] arr = {10,20,30,40,50,60};
//		String s = new String(arr);
//		System.out.println(s);
//		byte[] arr2 = s.getBytes();
//		for(byte a : arr2) {
//			System.out.print(a + "");
//		}
//		char ch[] = new char[7]; 
//		s.getChars(0, s.length()-1, ch, 0);
//		for(char c : ch ) {
//			System.out.println(c + "  ");
//		}
		/*
		String s1 = new String ("rama");
		s1 = s1+"a";// create object in rama+a and new object scp -a		
		String s2 = "ramaa";// create object scp --ramaa
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
				//  012
		String s = "hii  love jaivai";
//		System.out.println(s.lastIndexOf('a') + " " + s.lastIndexOf("ja"));
		System.out.println(s.lastIndexOf("java"));
		System.out.println(s.lastIndexOf('i',2));
		String s0 = "shviam";
		s0.concat("ss");
		System.out.println(s0); */
		String s = new String("rama");
		String s1 = s += "a";
		String s2 = "ramaa";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
//		String s4 = s2+"s";
		String s4 = "rama"+"s";
		String s5 = "ramas";
		System.out.println(s4==s5);
		
		
	}
}









