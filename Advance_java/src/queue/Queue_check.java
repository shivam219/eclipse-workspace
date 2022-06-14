package queue;

import java.util.*;

public class Queue_check {
	public static void main(String[] args) {
//		Queue<String> check =new LinkedList<>();  // implement linked_list in Queue
//		Queue<String> check =new ArrayDeque<>();  //implement ArrayDeque in Queue		
//		Queue<String> check =new PriorityQueue<>();	//PriorityQueue in Queue
		Queue<String> check = new LinkedList<>();
//		Queue<String> che2 = l
		check.add("Shivam");
		check.offer("deeepak");// if not add then throws exception
//		System.out.println(check.peek()); // check first element in queue
//		System.out.println(check.poll());//remove element 
//		System.out.println(check.remove());//remove first element in not then throws exception
//		
//		System.out.println();
//		System.out.println(check);
//		boolean ss= check.contains("shivam");
//		System.out.println(ss);
		List<Object> sorted = List.of("rama", "krishna", "radhe",20);
		System.out.println(sorted);
		sorted.add("shiva");
		System.out.println(sorted);
		}

	public static boolean m1() {
		return true;
	}
	public static boolean m1(int i) {
		return true;
	}
}
