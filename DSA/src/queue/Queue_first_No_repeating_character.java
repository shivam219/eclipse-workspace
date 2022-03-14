package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

public class Queue_first_No_repeating_character {
	final static int MAX_CHAR = 26;

	// function to find first non repeating
	// character of stream
	static void firstNonRepeating(String str) {
		// count array of size 26(assuming
		// only lower case characters are present)
		int[] charCount = new int[MAX_CHAR];

		// Queue to store ṁCharacters
		Queue<Character> q = new LinkedList<Character>();
		q.add(null);
		// traverse whole stream
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			// push each character in queue
			q.add(ch);

			// increment the frequency count
			charCount[ch - 'a']++;

			// check for the non repeating character
			while (!q.isEmpty()) {
				if (charCount[q.peek() - 'a'] > 1)
					q.remove();
				else {
					System.out.print(q.peek() + " ");
					break;
				}
			}
			if (q.isEmpty())
				System.out.print(-1 + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		String str = "abc";
//		firstNonRepeating(str);
		IntStream s = str.chars();
		s.forEach(e->System.out.println(e));
		char ch = 'a';
		System.out.println((int)ch);
//		System.out.println(str.chars());
	}
	

}
