package string;

public class convert_a_senetence_into_equivalent_mobile_keypad_sequence {
	// Function which computes the sequence
	static String printSequence(String arr[], String input) {
	
		String str = "";
		int n = input.length();
		for (int i = 0; i < n; i++) {
			if (input.charAt(i) == ' ')
				str = str + "0";
			else {
				int p = input.charAt(i);
				int position = input.charAt(i) - 'A';
				str = str + arr[position];
			}
		}
		return str;
	}

	public static void main(String[] args) {
		String str[] = { "2", "22", "222", "3", "33", "333", "4", "44", "444", "5", "55", "555", "6", "66", "666", "7",
				"77", "777", "7777", "8", "88", "888", "9", "99", "999", "9999" };
		String input = "SH";// use upper case
		System.out.println(printSequence(str, input));
		System.out.println((int )'a');
	}
}