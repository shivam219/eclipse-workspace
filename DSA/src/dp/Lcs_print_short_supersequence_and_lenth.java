package dp;

// if ask longest super sequence then just add both one after other
public class Lcs_print_short_supersequence_and_lenth {
	static int sup(String X, String Y, int n, int m) {
		int[][] dp = new int[n + 1][m + 1];
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= m; j++) {
				if (i == 0 || j == 0)
					dp[i][j] = 0;
				else if (X.charAt(i - 1) == Y.charAt(j - 1))
					dp[i][j] = dp[i - 1][j - 1] + 1;
				else
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
			}
		}
		return dp[n][m];
	}

	static int sumMain(String X, String Y, int n, int m) {
		int d = sup(X, Y, n, m);
		d = (m + n) - d;
		return d;
	}

	static String supPrint(String X, String Y,int n, int m) {
		int dp[][] = new int[n + 1][m + 1];
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= m; j++) {
				if (i == 0) {
					dp[i][j] = j;
				} else if (j == 0) {
					dp[i][j] = i;
				} else if (X.charAt(i - 1) == Y.charAt(j - 1)) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					dp[i][j] = 1 + Math.min(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}
		String str = "";
		int i = n, j = m;
		while (i > 0 && j > 0){
			if (X.charAt(i - 1) == Y.charAt(j - 1)){
				str += (X.charAt(i - 1));
				i--;
				j--;
			}else if (dp[i - 1][j] > dp[i][j - 1]) {
				str += (Y.charAt(j - 1));
				j--;
			} else {
				str += (X.charAt(i - 1));
				i--;
			}
		}
		while (i > 0) {
			str += (X.charAt(i - 1));
			i--;
		}
		while (j > 0) {
			str += (Y.charAt(j - 1));
			j--;
		}

		StringBuffer sb=  new StringBuffer(str.toString());
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		String X = "aaab";
		String Y = "abc";
		int n = X.length();
		int m = Y.length();
		System.out.println(supPrint(X, Y, n, m));
		System.out.println(sumMain(X, Y, n, m));
	}
}
