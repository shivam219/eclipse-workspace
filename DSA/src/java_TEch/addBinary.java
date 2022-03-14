package java_TEch;

import java.math.BigInteger;

public class addBinary {

	public static void main(String[] args) {
		System.out.println(addBinary("1010110111001101101000", "1000011011000000111100110"));
	}

	public static String addBinary(String A, String B) {
		boolean flag1 = true, flag2 = true;
		for (int i = 0; i < A.length(); i++) {
			if (A.charAt(i) != '0' && A.charAt(i) != '1') {
				flag1 = false;
				break;
			}
		}
		for (int i = 0; i < B.length(); i++) {
			if (B.charAt(i) != '0' && B.charAt(i) != '1') {
				flag2 = false;
				break;
			}
		}
		BigInteger d = new BigInteger("0");
		BigInteger n = new BigInteger("0");
		BigInteger m = new BigInteger("0");
		BigInteger c = new BigInteger("0");

		if (flag1 && flag2) {
			n = new BigInteger((binaryToDecimal1(Integer.parseInt(A))+""));
			m = new BigInteger( binaryToDecimal1(Integer.parseInt(B)) +"");
			c = n.add(m);
			d = new BigInteger((decimalToBinary(c.longValue())+""));	
		}
		if (flag1) {
			n = new BigInteger((binaryToDecimal1(Integer.parseInt(A))+""));
			m = new BigInteger(Integer.parseInt(B) +"");
			c = n.add(m);
			d = new BigInteger((decimalToBinary(c.longValue())+""));	
		}
		if (flag2) {
			n = new BigInteger(Integer.parseInt(A)+"");
			m = new BigInteger( binaryToDecimal1(Integer.parseInt(B)) +"");
			c = n.add(m); 
			d = new BigInteger((decimalToBinary(c.longValue())+""));	
			}
		return d.toString();
	}

	public static long decimalToBinary(long cur) {
		String arr = "";
		while (cur != 0) {
			long rem = cur % 2;
			cur = cur / 2;
			arr = rem + arr;
		}
		return Integer.parseInt(arr);
	}

	public static long binaryToDecimal1(long num) {
		long dec = 0, i = 0;
		long rem;

		while (num != 0) {
			rem = num % 10;
			num /= 10;
			dec += rem * Math.pow(2, i);
			++i;
		}
		return dec;
	}
	 public String addBinary2(String A, String B) {
	        StringBuilder sb = new StringBuilder();
	        int i = A.length() - 1;
	        int j = B.length() - 1;
	        int carry = 0;
	        while(i>=0||j>=0){
	            int sum = carry;
	            if(i>=0) sum += A.charAt(i)-'0';
	            if(j>=0) sum += B.charAt(j)-'0';
	            sb.append(sum%2);
	            carry = sum/2;
	            i--;j--;
	        }
	        if(carry!=0) sb.append(carry);
	        return sb.reverse().toString();
	    }

}
