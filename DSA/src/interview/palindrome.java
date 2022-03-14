package interview;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
//		System.out.println("ss");
//		int num = 152;
//		int rev = 0;
//		while(num!=0) {
//			rev =rev*10 + num%10;
//		num= num /10;
//			
//		}
//		System.out.println(rev);
//		System.out.println(num == rev ? "palindrome":"Not palindrome");
//		
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		String rev = "";
		int n = str.length() - 1;
		while (n-- > 0) {
			rev = rev + str.charAt(n);
		}
		System.out.println(str.equals(rev) ? "Yes" : "No");
	}
}
