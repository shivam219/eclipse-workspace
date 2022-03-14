package hackerrank;

public class Anagram_2 {
	public static void main(String[] args) {
		String a = "cat";
		String b = "act";
		a = a.toUpperCase();
		b = b.toUpperCase();

		boolean isAnagram = true;
		boolean visited[] = new boolean[b.length()];

		if (a.length() == b.length()) {
			for (int i = 0; i < a.length(); i++) {
				char c = a.charAt(i);
				isAnagram = false;
				for (int j = 0; j < b.length(); j++) {
					if (b.charAt(j) == c && !visited[j]) {
						isAnagram = true;
						System.out.print(visited[j]);
						break;

					}
				}
				if (!isAnagram) {
					break;
				}
			}

		}
		if (isAnagram) {
			System.out.println("Anagram");
		} else {
			System.out.println("not anagram");
		}

	}
}
