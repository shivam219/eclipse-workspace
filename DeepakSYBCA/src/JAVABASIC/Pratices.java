package JAVABASIC;

import java.util.Scanner;

public class Pratices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int a,b,c;
		System.out.println("enter the values");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a/b;
		try {
			c=a/b;
		//System.out.println("this will not be printed");
		} catch ( ArithmeticException e) {
		System.out.print("division by zero");
			
		System.out.println(c);
		}
	
	
	}

}
