package Fuction;

import java.util.function.Function;
import java.util.function.Predicate;

public class predicate {
	public static void main(String[] args) {

		Predicate<String> cl = s -> s.length() >= 5;
		
		Predicate<String> cl2 = s -> s.length() % 2 == 0;

		System.out.println("length of string "+cl.and(cl2).test("Rama"));
		System.out.println("length of string "+cl.or(cl2).test("Rama"));
		
		Function<Integer,Integer> dou = i -> i+i;
		Function<Integer,Integer> cute = i -> i*i;
		   
		System.out.println(dou.andThen(cute).andThen(dou).apply(2));
		System.out.println(dou.compose(cute).apply(2));
	}
}

// 