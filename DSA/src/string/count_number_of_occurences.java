package string;

public class count_number_of_occurences {
	public static void main(String[] args) {
		String str = "AABBCCDEFGGHKJHGFDafasdfdsaf &*&^%$##$%^%$W!@#$%^&*()(*&^%$#@!~ sadf asmdfnoafnlsdf sfnadslfnsd fsdfnlsdnfsda fasd  sdf sdafadsfdsf5sdf +4+94s4f6s4d 64+44 1s65 86+3 205652 GYTRDFGTRDFT";
//		Count(str);
		CoundAllAbc(str);
//		char ch = 'A';
//		System.out.println(ch+1);
//		System.out.println(((char)(65));
	}

	public static void Count(String str) {
		int[] abc = new int[26];
		for (int i = 0; i < str.length(); i++) {
			abc[str.charAt(i) - 'A']++;
		}
		for (int i = 0; i < abc.length; i++) {
			if (abc[i] != 0) {
				System.out.println("Character : "+((char)(65+i)) + "  Count :"+ abc[i] );
			}
		}
	}
	public static void CoundAllAbc(String str) {
		int[] abc = new int[265];
		for (int i = 0; i < str.length(); i++) {
			abc[str.charAt(i)]++;
		}
		for (int i = 0; i < abc.length; i++) {
			if (abc[i] != 0) {
				System.out.println("Character : "+((char)i) + "  Count :"+ abc[i] );
			}
		}
	}
}
