package string;

public class Douplicate_char_in_String {

	public static void main(String[] arg) {
		String ss = new String("rama");
		System.out.println(ss.charAt(0));
		System.out.println(ss.charAt(3));
		for (int i = 0; i < (ss.length() - 1); i++) {
			for (int j = i; j < (ss.length() - 1); j++) {
				if (ss.charAt(i) == ss.charAt(j))
					System.out.println(ss.charAt(i));
			}
		}
	}

}
