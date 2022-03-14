package hackerrank;


import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int l = s.length();
        String sf = s.substring(0, k);
        String sl = s.substring(l-k, s.length());
        System.out.println(smallest.compareTo(largest)); 
//      if (smallest.compareTo(largest) > 0 ? smallest = sf : largest = lf;
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
    	System.out.println("helllw ");
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
//        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}