package string;

public class Robin_karp_algo {
	static void robin(String str, String pat) {
		int m = str.length(), n = pat.length();
		int j = 0, i = 0, ii = 0, count = 0, cur = 0, ppow = 0;
		int scur = 0, sum = 0, spow = 0;
		int del = n - 1;
		for (i = 0; i < n; i++) {
			ppow++;
			cur = pat.charAt(i);
			count += cur * (26 * n - ppow);
			System.out.println(n - ppow);
			System.out.println(count);
		} // pattern string
		while (j < m) {
			spow++;
			scur = str.charAt(j); // aacabc
			sum += scur * (26 * m - spow);
			if (j - ii + 1 < n)
				j++;

			else if (j - ii + 1 == n) {// only till - 3
				if (sum == count)
					System.out.println(ii + " " + " " + j);
				else {
					int ch = str.charAt(ii);

					sum = ((sum) - (ch * 26 * del)) * 26 + (ch * 26);
					j++;
					i++;
				}
			}
		}

	}

	public static void main(String[] args) {
		String str = "aaaabc";
		String pat = "abc";
		robin(str, pat);
	}
}