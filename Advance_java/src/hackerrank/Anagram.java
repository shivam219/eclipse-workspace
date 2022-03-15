package hackerrank;

public class Anagram {

	public static void main(String[] args) {

		String a = "bc";
		String b = "abc";
		boolean isAna = false;
		for (int i = 0; i < a.length(); i++) {
			char cu = a.charAt(i);
			isAna = false;
			for(int j = 0; j<b.length();j++) {
				if(b.charAt(j)==cu) {
					isAna = true ;
				}
				
			}
			if(!isAna) {
			break;	
			}
			
			
		}
		if(isAna) {
			System.out.println("IS anagram");
		}
		else {
			System.out.println("Not anagram");
		}
	}
}
