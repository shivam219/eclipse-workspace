package dp;

import java.util.Arrays;

public class mcm_recursive {
//	use constraint for size of dp 
	static int dp[][] = new int[5][5];

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4 };
//		System.out.println(mcmRecur(arr, 1, arr.length-1));
//-----------memo----------- -------------------------------				
		for (int[] row : dp)
			Arrays.fill(row, -1);
		System.out.println(mcmMemo(arr, 1, arr.length - 1));
		for(int i = 0; i<dp.length;i++) {
			for(int j =0;j<dp.length;j++)
				System.out.print(dp[i][j]+ "   ");
			System.out.println();
		}
			
//-----------button-up--------------------------------------
		System.out.println(mcmButton(arr, arr.length));
	}

	static int mcmButton(int p[], int n) {
		/*
		 * For simplicity of the program, one extra row and one extra column are
		 * allocated in m[][]. 0th row and 0th column of m[][] are not used
		 */
		int m[][] = new int[n][n];

		int i, j, k, L, q;

		/*
		 * m[i, j] = Minimum number of scalar multiplications needed to compute the
		 * matrix A[i]A[i+1]...A[j] = A[i..j] where dimension of A[i] is p[i-1] x p[i]
		 */

		// cost is zero when multiplying one matrix.
		for (i = 1; i < n; i++)
			m[i][i] = 0;

		// L is chain length.
		for (L = 2; L < n; L++) {
			for (i = 1; i < n - L + 1; i++) {
				j = i + L - 1;
				if (j == n)
					continue;
				m[i][j] = Integer.MAX_VALUE;
				for (k = i; k <= j - 1; k++) {
					// q = cost/scalar multiplications
					q = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];
					if (q < m[i][j])
						m[i][j] = q;
				}
			}
		}

		return m[1][n - 1];
	}

	public static int mcmMemo(int[] arr, int i, int j) {
		if (i == j)
			return 0;
		if (dp[i][j] != -1)
			return dp[i][j];
		dp[i][j] = Integer.MAX_VALUE;
		for (int k = i; k < j; k++) {
			dp[i][j] = Math.min(dp[i][j], mcmMemo(arr, i, k) + mcmMemo(arr, k + 1, j) + arr[i - 1] * arr[k] * arr[j]);
		}
		return dp[i][j];
	}

	public static int mcmRecur(int[] arr, int i, int j) {
		if (i == j)
			return 0;
		int min = Integer.MAX_VALUE;
		for (int k = i; k < j; k++) {
			int count = mcmRecur(arr, i, k) + mcmRecur(arr, k + 1, j) + arr[i - 1] * arr[k] * arr[j];
			if (count < min)
				min = count;
		}
		return min;
	}
}
