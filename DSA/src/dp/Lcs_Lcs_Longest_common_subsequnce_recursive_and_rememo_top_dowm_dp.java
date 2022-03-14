package dp;

public class Lcs_Lcs_Longest_common_subsequnce_recursive_and_rememo_top_dowm_dp {
	static int dp[][]= new int[26][26];
	static int lcsmemo(String x, String y, int n, int m) {
		if (n == 0 || m == 0)
			return 0;
		if(dp[n][m]!=-1) return dp[n][m];
		else if (x.charAt(n - 1) == y.charAt(m - 1))
			return dp[n][m]= 1 + lcsmemo(x, y, n - 1, m - 1);
		else
			return dp[n][m]=  Math.max(lcsmemo(x, y, n, m - 1), lcsmemo(x, y, n - 1, m));
	}
	
	static int lcs(String x, String y, int n, int m) {
		if (n == 0 || m == 0)
			return 0;
		else if (x.charAt(n - 1) == y.charAt(m - 1))
			return 1 + lcs(x, y, n - 1, m - 1);
		else
			return Math.max(lcs(x, y, n, m - 1),
					lcs(x, y, n - 1, m));
	}
/// lcs  buttom up
	static int lcsttobu(char []x, char[] y, int n, int m) {
		int dp[][]= new int[n+1][m+1];
//		for(int i=0;i<n+1;i++) 
//			dp[0][i]=0;
//		for(int i=0;i<m+1;i++) 
//			dp[i][0]=0;
		for(int i=0;i<n+1;i++)
			for(int j=0;j<m+1;j++) {
				 if (i == 0 || j == 0)
			            dp[i][j] = 0;
			        else if (x[i-1] == y[j-1])
			            dp[i][j] = dp[i-1][j-1] + 1;
			        else
			            dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
			}
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<m+1;j++) {
				System.out.print(" "+ dp[i][j]);}System.out.println();}
		return dp[n][m];
	}

	public static void main(String[] args) {
		Lcs_Lcs_Longest_common_subsequnce_recursive_and_rememo_top_dowm_dp ob = new Lcs_Lcs_Longest_common_subsequnce_recursive_and_rememo_top_dowm_dp();
		String x = "aabb";
		int n = x.length();
		String y = "aabb";
		int m = y.length();
		int dp[][] = new int[n + 1][m + 1];
		System.out.println(lcs(x, y, n, m));
		// memo --all fill -1
		for (int i = 0; i <26; i++)
			for (int j = 0; j <26;j++)
					ob.dp[i][j] = -1;
		System.out.println(lcsmemo(x, y, n, m));
		/// tabulation - buttom 
		System.out.println(lcsttobu(x.toCharArray(), y.toCharArray(), n, m));
		StringBuffer sb = new StringBuffer(x);
		

	}
}
