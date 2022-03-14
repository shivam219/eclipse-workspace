package bit_manipulation;

public class revse {

	public static void main(String[] args) {
		System.out.println(reverse(2));
	}
	public static long reverse(long A) {
		long rev = 0;
		for (int i = 0; i < 32; i++) {
			rev <<= 1;
			if ((A & (1 << i)) != 0)
				rev |= 1;
		}
		return rev;
	}
	public static int reverseInt(int A) {
		int rev = 0;int  max =Integer.MAX_VALUE;
		long n = (max- A);
		
		return (int)n;
	}
}
