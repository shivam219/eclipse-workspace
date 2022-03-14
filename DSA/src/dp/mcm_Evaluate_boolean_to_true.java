package dp;

public class mcm_Evaluate_boolean_to_true {
	// Returns count of all possible
	// parenthesizations that lead to
	// result true for a boolean
	// expression with symbols like true
	// and false and operators like &, |
	// and ^ filled between symbols
	static int countParenth(char symb[], char oper[], int n) {
		int F[][] = new int[n][n];
		int T[][] = new int[n][n];

		// Fill diaginal entries first
		// All diagonal entries in T[i][i]
		// are 1 if symbol[i] is T (true).
		// Similarly, all F[i][i] entries
		// are 1 if symbol[i] is F (False)
		for (int i = 0; i < n; i++) {
			F[i][i] = (symb[i] == 'F') ? 1 : 0;
			T[i][i] = (symb[i] == 'T') ? 1 : 0;
		}

		// Now fill T[i][i+1], T[i][i+2],
		// T[i][i+3]... in order And F[i][i+1],
		// F[i][i+2], F[i][i+3]... in order
		for (int gap = 1; gap < n; ++gap) {
			for (int i = 0, j = gap; j < n; ++i, ++j) {
				T[i][j] = F[i][j] = 0;
				for (int g = 0; g < gap; g++)

				{
					// Find place of parenthesization
					// using current value of gap
					int k = i + g;

					// Store Total[i][k]
					// and Total[k+1][j]
					int tik = T[i][k] + F[i][k];
					int tkj = T[k + 1][j] + F[k + 1][j];

					// Follow the recursive formulas
					// according to the current operator
					if (oper[k] == '&') {
						T[i][j] += T[i][k] * T[k + 1][j];
						F[i][j] += (tik * tkj - T[i][k] * T[k + 1][j]);
					}
					if (oper[k] == '|') {
						F[i][j] += F[i][k] * F[k + 1][j];
						T[i][j] += (tik * tkj - F[i][k] * F[k + 1][j]);
					}
					if (oper[k] == '^') {
						T[i][j] += F[i][k] * T[k + 1][j] + T[i][k] * F[k + 1][j];
						F[i][j] += T[i][k] * T[k + 1][j] + F[i][k] * F[k + 1][j];
					}
				}
			}
		}
		return T[0][n - 1];
	}

	// Driver code
	public static void main(String[] args) {
		char symbols[] = "TTFT".toCharArray();
		char operators[] = "|&^".toCharArray();
		int n = symbols.length;

		// There are 4 ways
		// ((T|T)&(F^T)), (T|(T&(F^T))),
		// (((T|T)&F)^T) and (T|((T&F)^T))
		System.out.println(countParenth(symbols, operators, n));
	}
//	private static boolean totrue(char [] s, int i, int j, boolean istrue) {
//		if(i>j)return false;
//		if(i==j) {
//			if(istrue == true)
//				return s[i] == 'T';
//			else 
//				return s[i] =='F';
//		}int ans =0 ;
//		for(int k =i; k<j-1;k=k+2) {
//			boolean lt = totrue(s,i,k-1,true);
//			boolean lf = totrue(s,i,k-1,false);
//			boolean rt = totrue(s,k+1,j,true);
//			boolean rf = totrue(s,k+1,k,true);
//			if( s[i]=='&'  ) {
//				if(istrue ==  true)   
//					ans =  ans +lt & rt;
//				else ans = ans+ lf & rt + lf & rf + ;lf & rt;
//			}
//			if( s[i]=='|'  ) {
//				if(istrue ==  true)   
//					ans =  ans +lt & rt + lt * rf + lf & rt;
//				else ans = ans + lf & rf ;
//			}
//			if( s[i]=='xor'  ) {
//				if(istrue ==  true)   
//					ans =  ans +lt & rt + lr & rf ;
//				else ans = ans+ lf & rt + lf & rf ;
//			}
//			return ans;
//		}
//		
//		
//	}
}
