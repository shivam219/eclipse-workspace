package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Stream_method {
	public static void main(String[] args) {
//		filter/(predicate)return boolean value 
		List<String> name = List.of("Rama", "R_deva", "lakmi", "R_shiva");
		List<String> newName = name.stream().filter(e -> e.startsWith("R")).collect(Collectors.toList());
		System.out.println(newName);
//		map(funtion)
		// return element
		List<Integer> nu = List.of(20, 23, 4, 5, 5, 6, 2);
//		List<Integer> newnu =nu.stream().map(i-> i*i).collect(Collectors.toList());
//		System.out.println(newnu);
//		//way to print
//		newnu.stream().forEach(e->System.out.println(e));
//		// simple way by passing object reference
//		newnu.stream().forEach(System.out::println);

		List<Integer> llo = new ArrayList<>();

		llo.add(100);
		llo.add(120);
		llo.add(130);
		llo.add(150);
		Optional<Integer> inr = nu.stream().min((x, y) -> x.compareTo(y));

		Optional<Integer> inter2 = llo.stream().max((x, y) -> x.compareTo(y));

	}
}
