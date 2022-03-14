package string;

import java.util.Arrays;

public class Longest_common_prefix {
	  public static  String longestCommonPrefix(String[] a)
	    {
	        int n = a.length;
	 
	        /* if size is 0, return empty string */
	        if (n == 0) 
	            return "";
	 
	        if (n == 1)
	            return a[0];
	 
	        /* sort the array of strings */
	        Arrays.sort(a);
	        //replace min element first and max in last
	 
	        /* find the minimum length from first and last string */
	        int end = Math.min(a[0].length(), a[n-1].length());
	 
	        /* find the common prefix between the first and
	           last string */
	        int i = 0;
	        while (i < end && a[0].charAt(i) == a[n-1].charAt(i) )
	            i++;
	 
	        String pre = a[0].substring(0, i);
	        return pre;
	    }
	 
	    /* Driver Function to test other function */
	    public static void main(String[] args)
	    {
	        
	        String[] input = {"geeks", "hiiii", "geekl",};
	        System.out.println(longestCommonPrefix(input));
//	        System.out.println( "The longest Common Prefix is : " +
//	                                   Longest_common_prefix(input));
	    }

//	public static void main(String[] args) {
////		String[] str = {"shivam", "apple","car"};
////		Arrays.sort(str);
////		System.out.println(str.toString());
////		for(int i = 0 ; i<str.length;i++) {
////			System.out.println(str[i]);
////		}
//		String str2 = "shivam karma show";
//		char[] carr = str2.toCharArray();
//		Arrays.sort(carr);
//		 str2 = String.valueOf(carr);
//		System.out.println(str2);
//		
//	}
}
