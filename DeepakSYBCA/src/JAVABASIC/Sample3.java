package JAVABASIC;

import java.util.ArrayList;

public class Sample3 {

	public static void main(String[] args) {
	

		int a=0,b = 1;
		int c;
		System.out.println(a +" "+ b);
		for(int i=1;i<=15;i++) {
			c=a+b;
			System.out.println(c);
		
			a=b;
			b=c;
		}
	}

}
