package string;

import java.math.BigInteger;

public class String_multiplication {

	public static String multiply(String A, String B) {
		int len1 = A.length() - 1;
		int len2 = B.length() - 1;
		BigInteger n = new BigInteger((A.charAt(len1) - 48) + "");
		BigInteger m = new BigInteger((B.charAt(len2) - 48) + "");
		BigInteger nn = new BigInteger("0");
		BigInteger mm = new BigInteger("0");
		BigInteger mod = new BigInteger("10");
		BigInteger m10 = new BigInteger("10");
		for (int i = len1 - 1; i >= 0; i--) {
			nn = new BigInteger((A.charAt(i) - 48) + "");
			n = n.add(mod.multiply(nn));
			mod = mod.multiply(m10);
		}
		mod = new BigInteger("10");
		for (int i = len2 - 1; i >= 0; i--) {
			mm = new BigInteger((B.charAt(i) - 48) + "");
			m = m.add(mod.multiply(mm));
			mod = mod.multiply(m10);
		}
		return String.valueOf(n.multiply(m));
	}

	public static void main(String[] args) {
		System.out.println(multiply("0", "12"));
		
	}

	public String mujltiply(String A, String B) {
		int len1 = A.length() - 1;
		int len2 = B.length() - 1;
		long n = (A.charAt(len1) - 48);
		long m = (B.charAt(len2) - 48);
		long nn = 0;
		long mm = 0;
		long mod = 10;
		for (int i = len1 - 1; i >= 0; i--) {
			nn = A.charAt(i) - 48;
			n = (nn * mod) + n;
			mod = mod * 10;
		}
		mod = 10;
		for (int i = len2 - 1; i >= 0; i--) {
			mm = B.charAt(i) - 48;
			m = (mm * mod) + m;
			mod = mod * 10;
		}
		long r = n * m;
		return String.valueOf(r);

	}
}
