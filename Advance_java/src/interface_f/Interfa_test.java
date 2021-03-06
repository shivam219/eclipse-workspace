package interface_f;
//		Iterator<Integer> i = value.iterator();

//		while (i.hasNext()) {
//			System.out.println(i.next());
//		}

//		for (int i : value) {
//			
//			System.out.println(i);
//			
//		}
//  all above is External Iteration
//below following Internal Iterations
//		Stream api

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Interfa_test {
	public static void main(String[] args) {
		List<Integer> value = Arrays.asList(14, 5, 3, 4);
//		Consumer<Integer> c = new Consumer<Integer>() {
//			public void accept(Integer t) {
//				System.out.println(t);
//			}
//		};
//		value.forEach(c);
//		

//		pass by method
//		value.forEach(System.out::println);
		value.forEach(Interfa_test::doubleit);

//		Consumer<Integer> c = i -> System.out.println(i);
//		value.forEach(c);
//		
//		value.forEach(i -> System.out.println(i));

	}

	public static void doubleit(int i) {
		System.out.println(i * 2);
	}

}
