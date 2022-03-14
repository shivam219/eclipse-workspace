package string;

import java.util.ArrayList;
import java.util.List;

public class Count_all_palindrome_in_string {
	static boolean isPalin(String s, int l, int r) {
		if (l >= r)
			return true;
		if (s.charAt(l) != s.charAt(r))
			return false;
		return isPalin(s, l + 1, r - 1);
	}

	public static void main(String[] args) {
		String value = "ama in ava";
		String[] str = value.split("[\\s!,?._'@]+");
		int count = 0;
		for (String s : str) {
			if (isPalin(s, 0, s.length() - 1))
				count++;
		}
		System.out.println(count);

	}
}
