package Fuction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTest {
//	  3) both input and output
	public static void main(String[] args) {
//	----function 
		Function<Integer, String> getInt = t -> t * 10 + "data mutliple 10";
		System.out.println(getInt.apply(2));
//		parameter type 2) return type
		Function<String, Integer> len = (t) -> t.length();
		System.out.println(len.apply("Shviam"));
//		ex:2
		System.out.println(" ss");
		Function<Integer, String> fun2 = t -> {
			if (t % 2 == 0)
				return "number " + t + " is even ";
			else
				return "numerb is " + t + " is odd";
		};
//		System.out.println();
		int arr[] = new int[] { 2, 3, 4, 5, 6, 1, 9 };
		Arrays.stream(arr).forEach(t -> System.out.println(fun2.apply(t)));

		List<String> list = Arrays.asList("java", "c++", "python", "javaScript");
		Map<String, Integer> map = covertListToMap(list, x -> x.length());

		Function<Integer, Integer> f1 = i -> 2 * i;
		Function<Integer, Integer> f2 = i -> 2 + i;
		System.out.println();

		BiFunction<String, Integer, Emp> bif = (eno, ename) -> new Emp(eno, ename);
		ArrayList<Emp> emp = new ArrayList<Emp>();
//		l.add(bif.apply("shivam", 100));
//		l.add(bif.apply("somwati", 500));
//		l.add(bif.apply("deepak", 200));
//		l.add(bif.apply("ramesh", 400));
//		l.add(bif.apply("suraj", 300));
		emp.add(new Emp("aab", 2));
		emp.add(new Emp("aac", 1));
		emp.add(new Emp("aaa", 3));
		emp.add(new Emp("aab",  4));
		emp.add(new Emp("a", 5));
		System.out.println(emp);
		Collections.sort(emp,(e1,e2)->(e1.id<e2.id)?-1:(e1.id>e2.id)?1:0);
		System.out.println(emp);
		/*sorting based on name Ascending*/
		Collections.sort(emp,(e1,e2)->e1.name.compareTo(e2.name));
		System.out.println(emp);
		/*sorting based on name Descending */
		Collections.sort(emp,(e1,e2)->e2.name.compareTo(e1.name));
		System.out.println(emp);
		emp.stream().sorted();
		
		emp.stream().sorted((e1,e2)->e1.id>e2.id?-1:e2.id>e1.id?1:0 );
		emp.sort((e1,e2)->e1.id>e2.id?-1:e2.id>e1.id?1:0 );
		
	}

	private static <T, R> Map<T, R> covertListToMap(List<T> list, Function<T, R> func) {
		Map<T, R> result = new HashMap<>();
		for (T t : list) {
			result.put(t, func.apply(t));
		}
		return null;
	}
}
