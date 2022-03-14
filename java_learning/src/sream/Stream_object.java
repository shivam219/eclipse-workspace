package sream;

import java.util.stream.Stream;

public class Stream_object<T> {
	public static void main(String[] args) {
		// Stream api - colleciton process
		// collection /group of object -arrays/
		Stream<Object> em = Stream.empty();
		em.forEach(e->System.out.println(e) );
		
	}
}
