
package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream_a {
	public static void main(String[] args) {
		// one way // 1
		List<Integer> l1 = List.of(2, 4, 50, 60, 33, 23);
		System.out.println(l1);
		
		// two way
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(5);
		// three way
		// blower plat code is big
//		List<Integer> list3 = Arrays.asList(1, 4, 5, 6);
//		// even -- divide by 2 -- i%2==0
//		for (Integer i : list) {
//			if (i % 2 == 0)
//				list3.add(i);
//		}
		// using stream apic
//		Stream<Integer> stream = list.stream() ;
//		List<Integer> l1 = stream.filter(i-> i % 2 == 0).collect(Collectors.toList());
//		System.out.println(l1);

		l1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

		System.out.println(l1);
		List<Integer> l2 = l1.stream().filter(i -> i < 10).collect(Collectors.toList());
		///2
		System.out.println(l2);
		String name[] = { "shivam", "ramrl", "deepak", "ramesh" };
		Stream<String> str = Stream.of(name); // by default array
		str.forEach(e -> {
			System.out.println(e);
		});
		//3
		List<Integer> a =Arrays.asList(10, 20, 300);
		List<Integer> l3 =  a.stream().filter(i-> i>20).collect(Collectors.toList());
		System.out.println(l3);
		// 4
		IntStream in = Arrays.stream(new int[] {10,20,30});
		in.forEach(e->System.out.println(e));
		//5 
		List<Integer> l5 = new ArrayList<Integer>();
		l5.add(20);
		l5.add(30);
		l5.add(40);
		l5.add(50);
		Stream<Integer> ll5 = l5.stream();
		ll5.forEach(e->System.out.println(e));
	}

}
