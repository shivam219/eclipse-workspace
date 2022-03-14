package dp;

import java.util.Arrays;

public class mcm_min_partition {
	static int dp[][] = new int[100][100];

	public static void main(String[] args) {
		String s = "nititi.n";
		System.out.println(minPart(s, 0, s.length() - 1));

//------memorization dp
		for (int[] row : dp)
			Arrays.fill(row, -1);
		System.out.println(isPartMemo(s, 0, s.length() - 1));
//------memorization dp  more optimision to left and right
		System.out.println(isMemoOp(s, 0, s.length() - 1));
//------Tabulation buttom up 
		System.out.println(minCut("aab"));
	}

	static int isMemoOp(String s, int i, int j) {
		if (i > j || isPalin(s, i, j))
			return 0;
		int count, min = Integer.MAX_VALUE, l, r;
		for (int k = i; k < j; k++) {
			if (dp[i][j] != -1)
				return l = dp[i][j];
			else {
				l = isMemoOp(s, i, k);
				dp[i][j] = l;
			}
			if (dp[k+1][j] != -1)
				return r = dp[i][j];
			else {
				r = isMemoOp(s, i, k);
				dp[i][j] = r;
			}

			min = Math.min(l + r + 1, min);
		}
		return min;
	}

	static int isPartMemo(String s, int i, int j) {
		if (i > j || isPalin(s, i, j))
			return 0;
		if (dp[i][j] != -1)
			return dp[i][j];
		int min = Integer.MAX_VALUE, count;
		for (int k = i; k < j; k++) {
			count = isPartMemo(s, i, k) + isPartMemo(s, k + 1, j) + 1;
			min = Math.min(count, min);
		}
		return dp[i][j] = min;
	}

	static int minPart(String s, int i, int j) {
		if (i >= j || isPalin(s, i, j))
			return 0;
		int ans = Integer.MAX_VALUE, count;
		for (int k = i; k < j; k++) {
			count = minPart(s, i, k) + minPart(s, k + 1, j) + 1;
			ans = Math.min(ans, count);
		}
		return ans;
	}

	static boolean isPalin(String s, int i, int j) {
		if (i >= j)
			return true;
		if (s.charAt(i) != s.charAt(j))
			return false;
		return isPalin(s, i + 1, j - 1);
	}
	
	  public static int minCut(String a)
	    {
	        int[] cut = new int[a.length()];
	        boolean[][] palindrome = new boolean[a.length()][a.length()];
	 
	        for (int i = 0; i < a.length(); i++) {
	            int minCut = i;
	            for (int j = 0; j <= i; j++) {
	                if (a.charAt(i) == a.charAt(j) && (i - j < 2 || palindrome[j + 1][i - 1])) {
	                    palindrome[j][i] = true;
	                    minCut = Math.min(minCut, j == 0 ? 0 : (cut[j - 1] + 1));
	                }
	            }
	            cut[i] = minCut;
	        }
	 
	        return cut[a.length() - 1];
	    }
}
