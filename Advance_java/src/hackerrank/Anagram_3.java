package hackerrank;

public class Anagram_3 {
	public static void main(String[] args) {
		String a ="cat";
		String b ="act";
		boolean isAnagram =false;
		for(int i = 0; i<a.length();i++) {
			char c = a.charAt(i);//  c a
			isAnagram = false;
			for(int j = 0; j<b.length();j++) { // a == act 
				if(b.charAt(j) == c) {
					isAnagram = true;
					break;
				}
			}
			if(!isAnagram)  //not true == false
				break;
			
		}
		if(isAnagram) {
			System.out.println("Anagrams");
		}
		else {
			System.out.println("NOT Anagrams");
		}
	}
}
