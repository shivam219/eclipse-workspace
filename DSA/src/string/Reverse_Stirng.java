package string;
//Reverse a String------------------------------
//Check whether a String is Palindrome or not --- yes
//Find Duplicate characters in a string --yes
//Why strings are immutable
//Find Longest Recurring Subsequence in Stringe in Java? - yes
//Write a Code to check whether one string is a rotation of another -yes
//Write a Program to check whether a string is a valid shuffle of two strings or not -yes
//Count and Say problem - yes
//Write a program to find the longest Palindrome in a string.[ Longest palindromic Substring] 
//Print all Subsequences of a string. -yes
//Print all the permutations of the given string - yes
//Split the Binary string into two substring with equal 0’s and 1’s - yes
//Word Wrap Problem [VERY IMP]. -- half clear
//EDIT Distance [Very Imp] -- yes
//Find next greater number with same set of digits. [Very Very IMP] -- yes but not clear
//Balanced Parenthesis problem.[Imp] -- yes
//Word break Problem[ Very Imp] --yes not simple to seee
//Rabin Karp Algo--yes 
//KMP Algo - yes 
//Convert a Sentence into its equivalent mobile numeric keypad sequence. -yes
//Minimum number of bracket reversals needed to make an expression balanced.-yes
//Count All Palindrome Subsequence in a given String. -yes
//Count  number of given string in 2D character array - no
//Search a Word in a 2D Grid of characters. -no
//Boyer Moore Algorithm for Pattern Searching.- yes
//Converting Roman Numerals to Decimal - yes
//Longest Common Prefix - yes
//Number of flips to make binary string alternate -yes
//Find the first repeated word in string. -yes
//Minimum number of swaps for bracket balancing. yes
//Find the longest common subsequence between two strings. -- yes
//Program to generate all possible valid IP addresses from given  string. -- not
//Write a program to find the smallest window that contains all characters of string itself.- no
//Rearrange characters in a string such that no two adjacent are same --yes 
//Minimum characters to be added at front to make string palindrome  -yes
//Given a sequence of words, print all anagrams together -yes 
//Find the smallest window in a string containing all characters of another string - yes
//Recursively remove all adjacent duplicates-after  - yes
//String matching where one string contains wildcard characters - dp
//Function to find Number of customers who could not get a computer- yes
//Transform One String to Another using Minimum Number of Given Operation - yes
//Check if two given strings are isomorphic to each other - yse
//Recursively print all sentences that can be formed from list of word lists-yes

public class Reverse_Stirng {
	public static void main(String[] args) {
//	ss=sysou ->sop(ss)
		String ss = new String("rama sadfas   asfdsd");
//		char revstr[] = new char[ss.length()];
//		int n = ss.length();
//		int r = 0;
//		while (n-- > 0) {
//			revstr[r] = ss.charAt(n);
//			r++;
//		}for(int i : revstr)
//			System.out.print((char) i);
//		
//		System.out.println(solve("qxkpvo  f   w vdg t wqxy ln mbqmtwwbaegx   mskgtlenfnipsl bddjk znhksoewu zwh bd fqecoskmo"));
//		System.out.println((ss =ss.trim()));
		
		String s1= "    ";
		String s2 = s1;
		s2 = s2.replaceAll("\\s", "");
		if(s2.equals("")) {System.out.println(true);}
		System.out.println(s1.isBlank());
		System.out.println(s1.isEmpty());
		
		
	}
	 public static String solve(String A) {
	        String str[] = A.split("\\s");
	        if(str.length==1){return str[0];}
	        String ss = "";
	        int  n = str.length-1;
	        for(int i = n ; i>0;i--){
	        	if(!ss.equals("")) {
	            ss = ss + str[i]+" ";}
	        }
	        boolean  aa  =ss.isBlank();
	        ss = ss.trim();
	        return ss;
	    }
}
