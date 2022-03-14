package interview;

public class binary_toDecimal {
	public static void main(String[] args) {
		int bin  = 101010;
		System.out.println(BinaryToDecimal(bin));
	}

	private static int BinaryToDecimal(int bin) {
		if(bin==0) {return 0;}if(bin==1){return 1;}
		int rev =0;
		while(bin!=0) {
			int temp = bin%10;
			rev = rev * (temp*2)+ temp;
			bin = bin/10;
		}
		
		return rev;
	}
	
}
