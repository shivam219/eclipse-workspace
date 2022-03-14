package Fuction;


/*requri wrtie class to sub package level*/
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.sound.midi.SysexMessage;

public class all_collection_method {
	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<Integer>();		
		li.add(40);
		li.add(10);
		li.add(30);
		li.add(50);
		li.add(20);
		System.out.println(li);
		/*filter returns true then value is add reu */
		li.stream().filter(e->e%20==0).forEach(e->System.out.println(e));
		/* map modifies some change*/
		li.stream().filter(e->e>=10 && e<40).map(e->e=e+5).  forEach(e->System.out.println(e));
		/*count*/
		long l = li.stream().count();/*return long*/
//		li.stream().count().forEach();/*error*/
		/*collect*/
//		Collectors.toMap()
//		Collectors.toSet()
		List<Integer> ll=  li.stream().collect(Collectors.toList());
		
		/*min require to pass comparator*/
		Integer min = li.stream().min((e1,e2)->e1.compareTo(e2)).get(); 
		/*max require to pass comparator*/
		Integer max = li.stream().min((e1,e2)->e1.compareTo(e2)).get(); 
		
		/*forEach*/
		li.stream().forEach(e->System.out.println(e));
//		Funtcion<Integer,void> f = i->{
//			sysou
//		};
//		Consumer<Integer,void> c= i->{};
		Consumer<Integer> c = i->{
			System.out.println("shivam " +i);
		};
		
		li.stream().forEach(System.out::println);
		li.stream().forEach(c);
		/*To Array -> stream object into array */
		Integer[] i =(Integer[]) li.stream().toArray();
//		Integer[] i = li.toArray();
//		Integer[] i =(Integer[]) li.stream().toArray(Integer{}::new);
		
		/*stream concept avalable where group of elemets , arrays, colletions*/
		Stream s= Stream.of(10,20,30,40);
		Stream.of(i).forEach(e->System.out.println(e));
		
		Integer [] in = {10,20,30,40};
		Stream.of(i).forEach(e->System.out.println(e));
	
//		li.stream().map();
	}
}
