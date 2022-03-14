package string;

public class String_Shuffle2 {
	static boolean checkRotation(String str1, String str2) {
		int n = str1.length(), m = str2.length();
		if (n > m) {
			return false;
		}
//		for (int i = 0; i < m; i++) {
//			for (int j = 0; j < m; j++) {
//				if (str1.charAt(i) == str 2.charAt(j)) {
//					System.out.println(str1.charAt(i) + "  " + str2.charAt(j));
//					if (str1.charAt(i) == str2.charAt(j) && i == n - 1)
//						return true; 
//				} else
//					return false;
//			}
//		}
//		return false;
		int no = Math.min(n, m);
		for (int i = 0; i < str2.length(); i++) {// str
			for (int j = 0; j < str1.length(); j++) {// find
				if (str2.charAt(i) != str1.charAt(j))
					break;
				else if (str2.charAt(i) == str1.charAt(j)) {
					if (j == str1.length() - 1)
						return true;
					i++;

				}

			}
		}
		return false;
	}

	public static void main(String[] args) {
		String str1 = "bbb";
		String str2 = "Tthe deepak";
		if (checkRotation(str1, str2)) {
			System.out.println("Rotation exits");
		} else {
			System.out.println("not rotation");
		}
	}
}
