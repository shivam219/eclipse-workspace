package Test;

public class College_test {
	public static void main(String args[]) {
//		test 1
//		int x = -4;
//		System.out.println(x >> 1);
//		int y = 4;
//		System.out.println(y >> 1);
//		test 
//	int	x=1;
//	 x +=1; x =+ 1; 
		int x = 20; // true    ||          true      ||    fasle
		String sup = (x < 15) ? "s" :     (x < 22) ? "t" : "h";
		System.out.println(sup);
		
		
		
		int z = 11 & 9; //less value
		System.out.println(z);// 9
		int y = z ^ 3;   
		System.out.println(y);// 10
		System.out.println( y | 12 ); // 14 
		int g = 5; System.out.print(++g * 8);
//		what is output of relation operator 
		// true of false
	}

}
