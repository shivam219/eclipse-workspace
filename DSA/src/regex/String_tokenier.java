package regex;

import java.util.StringTokenizer;

public class String_tokenier {
//present in java.uitl packags
	// do divide into tokens
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Durga software rama");
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
		
	}
}
