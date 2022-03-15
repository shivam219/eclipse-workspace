package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Double_calcutlation {
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        
        double  tip = (meal_cost/100 ) * tip_percent; 
//        double  tip = (meal_cost * tip_percent) /100; 
        double  tax = (meal_cost/100 ) * tax_percent; 
        double total = meal_cost + tip + tax;
         int i = (int) Math.round(total);
        System.out.println(i);
      
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	System.out.println("Hellow ");
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
