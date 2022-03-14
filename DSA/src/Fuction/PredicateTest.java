package Fuction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import searching.insertion_sort;

public class PredicateTest implements Predicate<Integer> {
	@Override
	public boolean test(Integer t) {
		if (t % 2 == 0)
			return true;
		else
			return false;
	}

	public static  void main(String[] args) {
		Predicate<Integer> pre = new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				if (t % 2 == 0)
					return true;
				else
					return false;
			}
		};
		Predicate<Integer> pre2 = (t) -> t % 2 == 0 ? true : false;
		Predicate<Integer> pre3 = (m)-> m > 10;
		List<Integer> list = Arrays.asList(1,4,5,4,7,8);
		list.stream().forEach(t->System.out.println(pre2.test(t)?"Even" :"odd"));
//		--error becuase it only done when seperated object is create
//		new ArrayList<Integer>(2,3).stream().forEach(t->System.out.println(pre2.test(t)?"Even":"odd"));
		new ArrayList<Integer>(2).stream().forEach(t->System.out.println(pre2.test(t)?"Even":"odd"));
		
//		check is string  null , blank and empty
		Predicate <String> isNull = (s)->s!=null && !s.isBlank();
		System.out.println(isNull.test(null));
		
		
		
		
	}
}
