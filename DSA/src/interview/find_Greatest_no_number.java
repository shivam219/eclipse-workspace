package interview;

public class find_Greatest_no_number {
	public static void main(String[] args) {
		int a = 10, b = 20, c = 30;

//		if(a >b && a>c) 
//		System.out.println("A is greatest");
//		
//		else if(b>a && b>c)
//		System.out.println("B is greatest");
//		
//		else
//		System.out.println("C is greatest");
		
		// ternary ? :
//		int l = a > b ? a : b;
//
//		l = l > c ? l : c;
//		System.out.println(l);
		
		// ternary in short
		int l = c>(a>b?a:b)?c:(a>b?a:b); ///
		/* a>b ? a:b 
		 * 
		 * 
		 * 
		 */
		System.out.println(l);
	}
}
