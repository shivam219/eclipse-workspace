package exce;

import java.util.Scanner;

public class marry_s extends RuntimeException {
	public marry_s() {
	}
	public marry_s(String str) {
		super(str);
	}
	public static void  age60(String str){
	}
	public static void  age17(String str){	
	}
}

class mar {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter your age");
		Integer age = Integer.parseInt(sc.nextLine());
		if(age>60) {
		 throw new marry_s("Your age greater fit 60");
		}
		if(age>17) {
			throw new marry_s();
		}
		if(age<18) {
			throw new marry_s("Your age is not fit");
		}
			
	}
}