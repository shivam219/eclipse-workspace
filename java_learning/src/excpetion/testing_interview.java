package excpetion;

import java.util.Arrays;
import java.util.stream.IntStream;

public class testing_interview implements a {
	public static void main(String[] args) {
		int[] a = { 10, 120, 10 };
		System.out.println(a.length);

		IntStream s = Arrays.stream(a);

		s.forEach(e -> System.out.println(e / 2 == 0 ? e : 0));// getting one by one
		// lamda meam no name - no modifier - not datay requrire
		/// creating this class object having all default method of interface
		testing_interview ob = new testing_interview();
		ob.mq1();
		ob.mq1();

	}

}

interface a {
	default void mq1() {
		System.out.println("shivam");
	}
	private void m1() {
		System.out.println("rama");
	}
	public default void m3() {
		System.out.println("s");
	}
}