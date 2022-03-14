package M_f;
public class gcd_math {
//	public static void main(String[] args) {
//		System.out.println(gcd(10, 2));
//	}
	public static void main(String[] args) {		
		int num = 121, rev = 0;
		while (num != 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println("The reverse of the given number is: " + rev);
//		System.out.println(gcd(60,45));
		System.out.println(palindromic());

	}
	 public static double isRangeOfInteger(int n){
		 long  b =(long) Math.pow(2, 32);
		 System.out.println(b);
		 return Math.pow(2, 32);

	 }

	static public int gcd(int A, int B) {
		if (B == 0)
			return A;
		else
			return gcd(B, A % B);
	}
	public int gcd1(int A, int B) {
		if (A < B)
			return gcd1(B, A);
		if (B == 0)
			return A;
		else
			return gcd1(B, A % B);
	}
	/* 3rd way */
//     if (A == 0) return B;
//     return gcd(B%A, A);
    public static  int reverse(int A) {
    int B = A ; boolean flag =false ;
    if(A<0){A = Math.abs(A); flag = true;}
      int rev = 0;
      while(A!=0){
          int rem  = A % 10;
          rev = rev * 10 + rem;
          A = A  / 10;   
      }
      A = rev;
      if(flag){
          A = A - (A*2); return A;
      }
      int n = Integer.MAX_VALUE;
      if(A>=n){
          return 0;
      }
    return A;
    }
    public int reverse2(int A) {
        long reverse = 0;
         int sign = A >= 0 ? 1 : -1;
         A = Math.abs(A);
         while (A > 0) {
             reverse = reverse * 10 + A % 10;
             A /= 10;
         }
         reverse *= sign;
         return reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE ? 0 : (int)reverse;
     }
    public static int palindromic(){
    	int A = 2147447412;
    	 int B = A;
         if(0>A){
             return 0;
         }
         int rev = 0;
         while(A!=0){
             int rem = A % 10;
             rev = rev * 10  + rem;
              rev = rev /10;
         }
         return rev== B ?1:0;
    }
}