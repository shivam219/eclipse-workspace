package hackerrank;

import java.util.Scanner;

public class find_char_string {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

//		String sentence = "a a b b";
//		System.out.println(sentence);
//		String character = "";
//		String duplicate = "";
//		for (int i = 0; i < sentence.length(); i++) {
//			String current = Character.toString(sentence.charAt(i));
//
//			if (character.contains(current)) {
//				if(!duplicate.contains(current)) {
//					duplicate += current+",";
//				}
//			}
//			character += current;
//		}
//		System.out.println(duplicate);

//		String->length() char->length
//		String s = "beautiful beach";
//		char[] c = s.toCharArray();
//		System.out.println("String is   :-" + s);
//		System.out.print  ("Duplicate   :-");
//		for (int i = 0; i < s.length(); i++) {
//			for (int j = i + 1; j < s.length(); j++) {
//				if (c[i] == c[j]) {
//					System.out.print(c[j] + " ");
//					break;
//				}
//			}
//		}
//		---two time find duplicate character in string 
//		String s ="how are you ";
//		char[] c =s.toCharArray();
//		System.out.println("String value  :-"+s);
//		System.out.print("Duplcate value :-");
//		for(int i = 0; i<s.length();i++) {
//			for (int j = i+1; j<s.length();j++) {
//				if(c[i]==c[j]) {
//					System.out.println(c[j]+" ");
//					break;
//				}
//			}
//		}

//		------find duplicate word in string
//		find length , .equal 

//		String s = "Hello hello welcome WELCOME";
//		System.out.println("String    is :- "+s);
//		System.out.print("Duplicate is :- ");
//		String[] ss = s.toLowerCase().toString().split("\\s");
//	
//		for (int i = 0; i < ss.length; i++) {
//			for (int j = i + 1; j < ss.length; j++) {
//				if(ss[i].equals(ss[j])) {
//					System.out.print(ss[j] + " ");
//					break;
//				}
//			}
//		}

//		-----find doublicate word and remove from string print simple string doesn't cotain doublicates

		System.out.println("Enter no time ");
		int n = Integer.parseInt(sc.nextLine());
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextLine();
		}
		for (int i = 0; i < n; i++) {
			String[] c = s.toString().toLowerCase().split("\\s");
			
		}
	}
}
