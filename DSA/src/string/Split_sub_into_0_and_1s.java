package string;

public class Split_sub_into_0_and_1s {
	static int maxSubStr(String str, int n) {
		int count0 = 0, count1 = 0;
		int cnt = 0;
		for (int i = 0; i < n; i++) {

			if (str.charAt(i) == '0')
				count0++;
			else
				count1++;
			if (count0 == count1)
				cnt++;
		}
		return cnt;
	}

	public static void main(String[] args) {
		String str = "10110110";
		int n = str.length();
		System.out.println(maxSubStr(str, n));

	}

}
