package Fuction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

/*two input and boolean return */
public class bipredicate {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> p = (a, b) -> {
			if (a == b) {
				return true;
			} else {
				return false;
			}
		};

		System.out.println(p.test(20, 20));
		BiFunction<Integer, Integer, Emp> f = (t1, t2) -> {
			return null;
		};
	}
}
