package string;

public class Count_and_Say {
	static String countAndSay(int A) {
		// Base cases
		if (A == 1)
			return "1";
		if (A == 2)
			return "11";
		String str = "11";
		for (int i = 3; i <= A; i++) {
			str += '$'; // 11$
			int len = str.length(); // 3

			int cnt = 1; // Initialize count
							// of matching chars
			String tmp = ""; // Initialize i'th //
								// term in series
			char[] arr = str.toCharArray(); // 1 | 1| $
			for (int j = 1; j < len; j++) {
				if (arr[j] != arr[j - 1]) {
				
					tmp += cnt + 0;

					
					tmp += arr[j - 1];//// Append str[j-1]
					cnt = 1;	///reset
				}
				else
					cnt++;
			}

			// Update str
			str = tmp;
		}

		return str;
	}

	// Driver Code

	public static void main(String[] args) {
		System.out.println("s");
		String no = countAndSay(10);
		System.out.println(no);
	}
}
