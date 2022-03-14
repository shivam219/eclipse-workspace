package string;

import java.util.Scanner;

public class Palindrome {
	static boolean isPalin(String s, int l, int r) {
		if (l >= r)
			return true;
		if (s.charAt(l) != s.charAt(r))
			return false;
		return isPalin(s, l + 1, r - 1);
	}
	public static boolean isPalinWhile(char[] arr , int l , int r) {
		while(r>=l) {
			if(r>=l)return true;
			if(arr[l]==arr[r]) {
				l++; r--;
			}
			else {return false;}
		}
		return false;
	}

	public static void main(String[] args) {
//		System.out.println("ss");
		String s = "shivam raar deepak suraj ava";
		int l = 0;
//		int r = s.length() - 1;
//		System.out.println(isPalin(s, l, r) ? "yes is palin drom" : "not palindrome");
		String strarr[] = s.split("\\s");// if S mean except space
		String cur = "", max = "sssssssssssssssssssssssssss";
		for (int i = 0; i < strarr.length; i++) {
			cur = strarr[i];
			int n = cur.length();
			cur = isPalin(strarr[i], l, n) ? strarr[i] : strarr[i];

			if (max.length() < cur.length())
				max = cur;

		}
		System.out.println(max);

//		int num = 152;
//		int rev = 0;
//		while(num!=0) {
//			rev =rev*10 + num%10;
//		num= num /10;
//			
//		}s
//		System.out.println(rev);
//		System.out.println(num == rev ? "palindrome":"Not palindrome");
//
//		Scanner sc = new Scanner(System.in);
//
//		String str = sc.nextLine();
//		String rev = "";
//		int n = str.length();
//		while (n-- > 0) {
//			rev = rev + str.charAt(n);
//		}
//		System.out.println(str.equals(rev) ? "Yes" : "No");
//
//		System.out.println(rev);

//		longest palindrome
//		String str = sc.nextLine();
//		String rev = "";
//		int n = str.length();
//		while (n-- > 0) {
//			rev += str.charAt(n);
//
//		}

	}
}