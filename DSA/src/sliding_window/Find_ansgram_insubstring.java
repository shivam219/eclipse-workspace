package sliding_window;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_ansgram_insubstring {
	public static void main(String[] args) {
		String arr = ("aababaaa");
		String ang = "aab";
		ang = sort(ang);
		System.out.println(ang);
		String str = "";
		int i = 0, j = 0, sum = 0, max = 0, k = 3;
		while (j < arr.length()) {
			if (j - i + 1 < k)
				j++;
			else if (j - i + 1 == k) {
				str = arr.substring(i, j+1);
				sort(str);
				if(str.equals(ang)) {
					System.out.println(arr.substring(i,j+1));
				}
				i++;
				j++;
			}
		}
	}
	static String sort(String s) {
		char[] carr = s.toCharArray();
		Arrays.sort(carr);
		String str1 = String.valueOf(carr);
		return str1;
	}
}
