package Fuction;

import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Predicate_consumer_function_supplier {
	// 4 type of functional interface
//	  1)predicate-- boolean result 
//	  2)consumer-- modifies data no output

	public static void main(String[] args) {
		Predicate<String> len = str -> str.length() < 5;
		System.out.println("check len " + len.test("abse"));

//				---consumer
		Person p = new Person();
		Consumer<Person> setName = t -> t.setName("shivam");
		setName.accept(p);
		System.out.println(p.getName());
		Consumer<String> con = new Consumer<String>() {
			public void accept(String t) {
				System.out.println(t);
			}
		};
		con.accept("Consumer is dat");


//				-----supplier
		Supplier<Double> getRan = () -> Math.random();
		System.out.println(getRan.get());

	}

}

class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
