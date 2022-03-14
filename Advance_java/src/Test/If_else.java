package Test;

public class If_else {
	public static void main(String[] args) {
		int x= 10;
//		if (true ) {
//			System.out.println("this is neseted if block");
//		
//		}
//		else {
		if (true) {
			if(true) 
			{
			System.out.println("this is nested if");
			}
		} else {
			System.out.println("out");
		}
		
		if(true)
			if(20<10)
				System.out.println("if block");
			else
				System.out.println("else part");
		
	}
}
