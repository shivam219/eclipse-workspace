package queue;
import java.util.*;

import java.util.Queue;

public class Queue_check {
	public static void main(String[] args) {
//		Queue<String> check =new LinkedList<>();  // implement linked_list in Queue
//		Queue<String> check =new ArrayDeque<>();  //implement ArrayDeque in Queue		
//		Queue<String> check =new PriorityQueue<>();	//PriorityQueue in Queue
		Queue<String> check =new LinkedList<>();
		check.add("Shivam");
		check.offer("somwati maa");
		System.out.println(check.peek()); // check first element in queue
		System.out.println(check.poll());//remove element 
		
		System.out.println(check);
		boolean ss= check.contains("shivam");
		System.out.println(ss);
		
	}
}
