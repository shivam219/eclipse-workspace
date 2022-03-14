package string;

public class nimimum_number_of_traversal_need_to_make_bracket_balance {
	static int minBalace(String exp) {
		int len = exp.length();
		int ans = 0;
		if (len % 2 != 0)
			return -1;
		int left_brace = 0, right_brace = 0;
		for (int i = 0; i < len; i++) {
			char ch = exp.charAt(i);
			if (ch == '{')
				left_brace++;
			else {
				if (left_brace == 0) {
					right_brace++;
				} else
					left_brace--;
			}
		}
		ans = (int) (Math.ceil((0.0 + left_brace) / 2) + Math.ceil((0.0 + right_brace) / 2));
		return ans;

	}

	public static void main(String[] args) {
		String expr = "}}{}{{";

		System.out.println(minBalace(expr));
	}
}
