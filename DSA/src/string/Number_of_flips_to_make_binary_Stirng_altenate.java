package string;

public class Number_of_flips_to_make_binary_Stirng_altenate {
	static int noFlip(String str) {
		int cnt1 = 0, cnt2 = 0;
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 0 && str.charAt(i) == '0')
				cnt1++;
			else if (i % 2 != 0 && str.charAt(i) == '1')
				cnt1++;
				//odd
			if (i % 2 == 0 && str.charAt(i) == '1')
				cnt2++;
			else if(i % 2 != 0 && str.charAt(i) == '0')
				cnt2++;
		}
		return (int) Math.min(cnt1, cnt2);

	}

	public static void main(String[] args) {

		String str = "011010101100";
//		System.out.println(noFlip(str));
		int no= noFlip(str);
		System.out.println(no);

	}
}
