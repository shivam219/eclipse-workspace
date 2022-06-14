package Fuction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class predicate {
	public static void main(String[] args) {

		Predicate<String> cl = s -> s.length() >= 5;

		Predicate<String> cl2 = s -> s.length() % 2 == 0;

		System.out.println("length of string " + cl.and(cl2).test("Rama"));
		System.out.println("length of string " + cl.or(cl2).test("Rama"));

		Function<Integer, Integer> dou = i -> i + i;
		Function<Integer, Integer> cute = i -> i * i;

		System.out.println(dou.andThen(cute).andThen(dou).apply(2));
		System.out.println(dou.compose(cute).apply(2));
		ArrayList<Integer> al = new ArrayList<Integer>();
		List<String> cn = Arrays.asList("America", "Canada", "Ireland", "Finland", "India");
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(15);
		al.stream().filter(predicate::isEven).forEach(System.out::println);
		Predicate<Integer> preNev = e -> e % 2 == 0 ;
		al.stream().filter(preNev.negate()).forEach(System.out::println);
	}

	public static boolean isEven(int n) {
		return n % 2 == 0 ;
	}
}

// 