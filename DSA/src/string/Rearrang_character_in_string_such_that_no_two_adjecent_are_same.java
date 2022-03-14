package string;

import java.util.ArrayList;

public class Rearrang_character_in_string_such_that_no_two_adjecent_are_same {
	static String noTwoajecent(ArrayList<Character> arr) {
//		ArrayList<Character> arr = new ArrayList<>();
		int n = arr.size();	  int base = 0;
		String str = "";      String re = "";
		for (int i = 0; i < n;) {
			if(arr.size() ==1) {re += arr.get(i); arr.remove(i);}
			if(arr.isEmpty()) break;
			
			if(arr.get(i)== arr.get(i+1)) {
			while (arr.get(i) == arr.get(i + 1)) {
					i++;
				if (arr.get(i + 1) != arr.get(i)) {
					i++;
					break;}
			}}
			else 
				i++;
			if (arr.get(base) != arr.get(i)) {
				int sn= re.length();
				if(sn>=2) {		
					  if(re.charAt(re.length()-1)==arr.get(base)) {
					re = re + arr.get(i);
					re = re + arr.get(base);
					arr.remove(base); base = 0;
					arr.remove(i);     i   = 0;
					} else {
						re = re + arr.get(base);
						re = re + arr.get(i);
						arr.remove(base); base = 0;
						arr.remove(i-1);     i   = 0;	
					}
				}
				else {
				re = re + arr.get(base);
				re = re + arr.get(i);
				arr.remove(base); base = 0;
				arr.remove(i);     i   = 0;
				}
			}
		}
		System.out.println("this "+ re);
		return re;
	}

	public static void main(String[] args) {
		String str = "aaabbcacdc";
		ArrayList<Character> chars = new ArrayList<>();
        for (char ch : str.toCharArray()) {
            chars.add(ch);
        }
        System.out.println(chars);
        String str2 = noTwoajecent(chars);
        System.out.println(str2);
        
	}

}
