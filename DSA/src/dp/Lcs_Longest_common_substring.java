package dp;

public class Lcs_Longest_common_substring {
	static int lcss(char []x ,char[] y, int n , int m) {
		int dp[][] = new int[n+1][m+1]; int c =0;
		for(int i=0;i<n+1;i++)
			for(int j=0;j<m+1;j++) {
				if(i==0||j==0)dp[i][j]= 0;
				else if(x[i-1]==y[j-1]) {dp[i][j]= dp[i-1][j-1]+1;
				  c = Integer.max(c,dp[i][j]);// trick to print
				  
				  }
				else 
					dp[i][j]= 0;
			}
		
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<m+1;j++) {
				System.out.print(dp[i][j]);
			}
			System.out.println();
		}
		System.out.println(c);
		return dp[n][m];
		
	}
	public static void main(String[] args) {
		String X = "aaab";
		String Y = "abc";
		String l1 = "aaab";int n = l1.length();
		String l2 = "abc";int m= l2.length();
		System.out.println(lcss(l1.toCharArray(),l2.toCharArray(),n,m));
	}
}
