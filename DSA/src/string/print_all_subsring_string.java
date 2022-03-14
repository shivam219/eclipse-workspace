package string;

public class print_all_subsring_string {
	public static void SubString(String str, int n) {
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j <= n; j++)
				System.out.println(str.substring(i, j));
	}

	public static void only(String A, int n) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
//				String ss = A.substring(i, j);
//				int m = ss.length() - 1;
				char ch1 = A.charAt(i);
				char ch2 = A.charAt(j);
//				char ch1 = (char) ss.codePointAt(0);
//				char ch2 = (char) ss.codePointAt(m);
				if ((ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u')
						&& (ch2 != 'a' && ch2 != 'e' && ch2 != 'i' && ch2 != 'o' && ch2 != 'u')) {
					count++;
				} else if ((ch2 == 'a' | ch2 == 'e' | ch2 == 'i' | ch2 == 'o' | ch2 == 'u')
						&& (ch1 != 'a' && ch1 != 'e' && ch1 != 'i' && ch1 != 'o' && ch1 != 'u')) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
//		only("acc", 3);

//		System.out.println(printAllSubString("abef"));

//		check();
		System.out.println(strStr("bbbbbbbbab", "baba"));
	}

	public static boolean is1() {
		System.out.println("called true");
		return false;
	}

	public static boolean is2() {
		System.out.println("called false");
		return false;
	}

	public static void check() {
//		if(is1()||is2()){
//			// || - check single 
//		}	
		if (is1() & is2()) {
			// && - check single ---weather false then not check rest
			// & - check all -- weather first return false
		}
	}

	public static int printAllSubString(String A) {
		char bb[] = A.toCharArray();
		int n = A.length();
		int count = 0;
		for (int i = 0; i < n; i++) {
			char ch = A.charAt(i);
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
					|| ch == 'o' || ch == 'u') {
				count = count + (A.length() - i);
			}
		}
		return count;
	}

	public static int strStr(final String A, final String B) {
		int ans = -1;
		int len = B.length();
		for (int i = 0; i < A.length() - len + 1; i++) {
			String str = A.substring(i, i + len);
			if (str.equals(B)) {
				ans = i;
				break;
			}
		}
		return ans;
	}
}
