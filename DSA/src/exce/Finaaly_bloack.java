package exce;

import java.io.FileNotFoundException;

//System.exit(0); use by --status code
//System.exit(1)//except 0 
//internal loging purpose

//e.printStackTrace() print exception class and name and currseponding class
//e.getMassege() print only exception 
//sop(e) print java.lang.exception.: divide by zero
public class Finaaly_bloack {
	public static void main(String[] args) {
	
		try {
			try {	
				System.out.println(10/0);
			} catch ( NullPointerException e) {
				e.toString();
				System.out.println("Handle");
			}
			System.out.println( "outter tryppe");
		}
		catch(ArithmeticException e) {
			System.out.println("AritmeticException is handle by outer catch");
		}
		finally {
			System.out.println("outer finally");
		}
		
		
	}
	
}
