package dp;

public class Lcs_Longest_repeative_subsequce {
	static String longestRepeatedSubSeq(String str) {
		int n = str.length();
		int[][] dp = new int[n + 1][n + 1];
		for (int i = 0; i <= n; i++)
			for (int j = 0; j <= n; j++)
				if(i==0|| j==0) dp[i][j]=0;
				else if (str.charAt(i - 1) == str.charAt(j - 1) && i != j)
					dp[i][j] = 1 + dp[i - 1][j - 1];
				else
					dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);

		for(int i =0;i<n+1;i++) {
			for(int j=0; j<n+1;j++) {System.out.print(" "+dp[i][j]);} System.out.println();}
		String res = "";
		int i = n, j = n;
		while (i > 0 && j > 0) {
			if (dp[i][j] == dp[i - 1][j - 1] + 1) {
				res = res + str.charAt(i - 1);
				i--;
				j--;
			} else if (dp[i][j] == dp[i - 1][j])
				i--;
			else
				j--;
		}
//		if(res.length()==0)
//			return 0;
			return new StringBuffer(res).reverse().toString();
//		else return res.length();  
	}

	public static void main(String[] args) {
		System.out.println(longestRepeatedSubSeq(new String("abba")));
		System.out.println("".length() + "len");
			
	}
}
