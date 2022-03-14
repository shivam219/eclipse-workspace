package interview;

public class swapping_number {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		//2
		a=a+b;
		b=a-b;
		b=a-b;
		// 3
		a=a*b;
		b=a/b;
		a=a/b;
		
		// 4 xor
		a=a^b;
		b=a^b;
		a=a^b;
		//
		b= a+b -(a=b);
		
		
	}
}
