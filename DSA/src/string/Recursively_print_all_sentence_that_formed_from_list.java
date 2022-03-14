package string;

public class Recursively_print_all_sentence_that_formed_from_list {
	static final int R = 3;
	static final int C = 3;
	// A recursive function to
	// print all possible sentences
	// that can be formed
	// from a list of word list
	static void printUtil(String[][] arr, int m, int n, String[] out) {
		// Add current word to output array
		out[m] = arr[m][n];
		// If this is last word of
		// current output sentence,
		// then print the output sentence
		if (m == R - 1) {
			for (int i = 0; i < R; i++)
				System.out.print(out[i] + " ");
			System.out.println();
			return;
		}
		// Recur for next row
		for (int i = 0; i < C; i++)
			if (arr[m + 1][i] != "" && m < C)
				printUtil(arr, m + 1, i, out);
	}
	// A wrapper over printUtil()
	static void print(String[][] arr) {
		// Create an array to store sentence
		String[] output = new String[R];
		// Consider all words for first
		// row as starting points and
		// print all sentences
		for (int i = 0; i < C; i++)
			if (arr[0][i] != "")
				printUtil(arr, 0, i, output);
	}
	// Driver program to test above functions
	public static void main(String[] args) {
		String[][] arr = { { "you", "we","" }, { "have", "are", "" }, { "sleep","eat","game" } };
		print(arr);
	}
}
