package string;

import java.util.HashMap;

public class Find_the_first_repeated_word_in_string {

	static String findfirst(String s) {
		String token[] = s.split("\\s");
		HashMap<String ,Integer> setOfWords = new HashMap<String ,Integer>();
		
		for(int i = 0; i<token.length;i++) {
			if(setOfWords.containsKey(token[i]))
				setOfWords.put(token[i], setOfWords.get(token[i])+1);
			// if value occurs one more time increase count
			else setOfWords.put(token[i], 1);
			
		}
		// print max count element from hashMap
		for(int i = 0; i<token.length;i++) {
			int count= setOfWords.get(token[i]);
			if(count>1)
				return token[i];
		}
		return "no repetition";
	}
	public static void main(String[] args) {
		

	}

}
