package bit_manipulation;

import java.util.Stack;

//static
public class Convert_integer_binary {
	static int reverse(int n) {
		int m = n;
		int rev = 0;
		while (n > 0) {
			int temp = n % 10;
			rev = rev * 10 + temp;
			n = n / 10;
		}
System.out.println("sd");
		System.out.println(m);
		System.out.println(rev);
		return 1;
	}
//	static void decimalToBinary(int num) {
//
//		Stack<Integer> st = new Stack<>();
//		//
//		while (num > 0) {
//			st.push(num % 2);
//			num = num / 2;
//		}
//		while (!(st.isEmpty())) {
//			System.out.print(st.pop());
//		}
//	}
//
//	// inbuilt - method
//	static void inbuildmethod(int num) {
//		System.out.println(Integer.toBinaryString(num));
//	}

	public static void main(String[] args) {
		int num = 45;

		reverse(num);

	}
}
