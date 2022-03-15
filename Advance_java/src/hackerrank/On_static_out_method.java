package hackerrank;

import java.util.Scanner;

public class On_static_out_method {
	static Scanner sc = new Scanner(System.in);
	static boolean flag = true;
	static int H = sc.nextInt();
	static int B = sc.nextInt();

	static {
		try {
			if (B <= 0 || H <= 0) {
				flag = false;
				throw new Exception("Breadth and height must be positive");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		System.out.println("thii");
		if (flag) {
			int c  = H*B;
			System.out.println(c);
		}
	}

}
