package bit_manipulation;

public class NuberOfbit {
	public static void main(String[] args) {
	System.out.println(Bin(10));
	System.out.println(Bin2(10));
	}
	public static int Bin(int n ) {
		int count = 0;
		while(n!=0) {
			n = n& (n-1);
			count++;
		}
		return count; 
	}
	public static int Bin2(int n) {
		int count = 0; int mask = 1;
		for(int i = 0; i<32;i++) {
			if((n & mask)!=0)count++;
			mask = mask<<1;
		}
		return count;
	}
}
