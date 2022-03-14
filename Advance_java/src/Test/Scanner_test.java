package Test;

import java.util.Scanner;

public class Scanner_test {
	public static void main(String[] args) {
		int go=10;
		Scanner in  = new Scanner(System.in);
		System.out.println("integer input");
		int sum=in.nextInt();
		in.nextLine();
		System.out.println(sum);
		
		String  mystr = in.nextLine();
		System.out.println(mystr);
		
	}
}
