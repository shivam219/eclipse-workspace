package string;

public class KMP_algo {
	public static void main(String[] args) {
		String s = "abceabeghbeghi";
		String pat = "beghi";
//		int vis[] = kmp("abcba".toCharArray()) ;
//		for(int v : vis) {
//			System.out.println(v);
//		}
		String str = "abcba";
		System.out.println(isPalinWhile(str.toCharArray(),0,str.length()-1));
		int vis[] = kmp(pat.toCharArray());
//		System.out.println(kmpaglo(s.toCharArray(), pat.toCharArray(), vis));
		System.out.println(kmpforPalinRemain("bebaa".toCharArray()));
	}

	public static int[] kmp(char[] arr) {
		int vis[] = new int[arr.length];
		int j = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[j]) {
				vis[i] = j + 1;
				j++;
			} else {
				if (j - 1 != -1) {
					j = vis[j - 1];
					i--;
				}
			}
		}
		return vis;
	}


public static int kmpforPalinRemain(char[] arr) {
	int vis[] = new int[arr.length];
	int j = 0;  int count = 0;
	for (int i = 1; i < arr.length; i++) {
		if (arr[i] == arr[j]) {
			vis[i] = j + 1; count++;
			j++;
		} else {
			if (j - 1 != -1) {
				j = vis[j - 1];
				i--;
			}
		}
	}
	if(count==0) {count = arr.length-1;}
	return count;
}

	public static boolean kmpaglo(char[] arr, char pat[], int vis[]) {
		int j = 0 ; int patlen = pat.length ;
		boolean flag = false;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == pat[j]) {
				j++;
				if (j >=patlen) {
					flag = true;
					break;
				}
			} else {
				if (j - 1 != -1) {
					j = vis[j - 1];
					i--;
				}
			}
		}
		if (flag) {
			return true;
		} else
			return false;
	}
	public static boolean isPalinWhile(char[] arr , int l , int r) {
		while(r>=l) {
			if(l>=r)return true;
			if(arr[l]==arr[r]) {
				l++; r--;
			}
			else {return false;}
		}
		return false;
	}

	
	
	
	
	
	
	
	
	
	
	
//	by youtuber
	private static int[] computeTemporaryArray(char pattern[]) {
		int[] lps = new int[pattern.length];
		int index = 0;
		for (int i = 1; i < pattern.length;) {
			if (pattern[i] == pattern[index]) {
				lps[i] = index + 1;
				index++;
				i++;
			} else {
				if (index != 0) {
					index = lps[index - 1];
				} else {
					lps[i] = 0;
					i++;
				}
			}
		}
		return lps;
	}

	public boolean KMP(char[] text, char[] pattern) {
		int lps[] = computeTemporaryArray(pattern);
		int i = 0;
		int j = 0;
		while (i < text.length && j < pattern.length) {
			if (text[i] == pattern[j]) {
				i++;
				j++;
			} else {
				if (j != 0) {
					j = lps[j - 1];
				} else {
					i++;
				}
			}
		}
		if (j == pattern.length) {
			return true;
		}
		return false;
	}
}
