package hashing;

import java.util.Arrays;

public class sort_String {
	public static void main(String[] args) {
		String str  =  "abdfasdfa";
		char ch [] = str.toCharArray();
		Arrays.sort(ch);
		for(char c : ch) {System.out.print(c+ " ");}
	}
}
