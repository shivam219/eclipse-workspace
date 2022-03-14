package string;

import java.util.Arrays;

public class knuth_morris_pratt {
	static int[] calcPrefixLen(String pattern) {
		int patternLen = pattern.length();
		int arr[] = new int[patternLen + 1];
		arr[0] = -1;
		arr[1] = 0;
		int prefixLen = 0;
		int i = 1;
		while (i < patternLen) {
			if (pattern.charAt(prefixLen) == pattern.charAt(i)) {
				prefixLen++;
				i++;
				arr[i] = prefixLen;
			} else if (prefixLen > 0) {
				prefixLen = arr[prefixLen];// note that we do not increament i here
			} else {
				i++;
				arr[i] = 0; // prefixLen reached 0 so sae that into arr[] and move forward
			}
		}
		return arr;
	}
	public static void main(String[] args) {
//		String[] a = new String[] {"a","b","c","d","e","f"};
		String a = "abcdef";

		System.out.println(	Arrays.toString(calcPrefixLen(a))	);
	}
}
