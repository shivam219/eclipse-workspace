package interview;

public class armstrong {
	public static void main(String[] args) {
		int n = 153
				;
		System.out.println(arm(n));
//		System.out.println(perfect(6));
	}

	public static int arm(int n) {
		if(n<=0) {return 0;}
		int total = 0;
		while(n!=0) {
		 int temp = n%10;
		 total = total + ((int)(Math.pow(temp,3)));
		 n=n/10;
		}
		return total;
	}
	
	public static int perfect(int n) {
		if(n==0) {return n;}
		int half = n/2; int total = 0; int i = 1;
		while(i<=half) {
			if(n%i==0){total = total +i;}
			i++;
		}
		return total;
	}
	public static int tech(int n ) {
//		2025
//		Number of digits = 4 (even)
//		Split 2025 into two halves, then
//		first half = 20
//		second half = 25
//		sum of the halves = 20+25 = 45
//		square of the sum of the halves = 45*45 = 2025
		return 0;
	}
	public static boolean automorphic(int n ) {
		int num = n*n;
		while(n!=0) {
			int temp = num%10;
			if(temp == n) {System.out.println("automorphics ");return true;}
		}
		return false;
	}
	
}
