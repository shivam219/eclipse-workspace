package hackerrank;

import java.util.Scanner;

public class Stack_ss {
	public static void main(String[] args) {
		System.out.println("S");
		Scanner sc = new Scanner(System.in);
		String end ="end";
		while (sc.hasNext()) {
			String input = sc.next().replaceAll("\\(\\)|\\[\\]|\\{\\}", "");
			System.out.println(input.isEmpty());
			System.out.println(sc.match());
		}
		
		
//		  String input=sc.next();
//		    while(input.length() != (input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length());
//		    System.out.println(input.isEmpty());
	}
}
