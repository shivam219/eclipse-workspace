package string;

public class check_oneString_isPresent_another {
	public static void main(String[] args) {
		String str = "This is sahyogg college";
		String pat = "sahyog";
		isPresent(str, pat);
		
	}	
	public static void isPresent(String str ,String pat){
		int count =0;
		int[] hast_pat = new int[265];
		int[] hast_str = new int[265];
		for (int i = 0; i < str.length(); i++) {
				hast_pat[str.charAt(i)]++; count++;
			}
		
		for (int i = 0; i < str.length(); i++) {
			if(hast_str[str.charAt(i)]<=hast_pat[str.charAt(i)]) {
				count--;
			}
		}
		if(count==0) {
			System.out.println(""+ pat +" - is present in :: " + str);
		}
		
	}
}