package string;

public class Isomorphic {
	static boolean isomorphic(char []str1 , char []str2) {
		int j = 0, n = str1.length;
		while(j<n-1) {
			if(str1[j]==str1[j+1]) {
				if(str2[j]!=str2[j+1]) return false;
				else j++;
			}
			else if( str1[j]!=str1[j+1]) {
				if(str2[j]==str2[j+1])
					return false;
				else j++;
			}	
		}
		return true;
	}public static void main(String[] args) {
		System.out.println("isomorphic ");
		String str1 = "aabaa";
		String str2 = "aacma";
		System.out.println(isomorphic(str1.toCharArray(), str2.toCharArray()));
	}
}
