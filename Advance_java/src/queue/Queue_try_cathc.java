package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_try_cathc {
	public static void main(String[] args) {
		Queue<String>ss=new LinkedList<>(); //add - offer // element - peek // remove - poll
		
		boolean b=ss.contains("A");	
		System.out.println(b);
		System.out.println(ss.isEmpty());
		System.out.println(ss.peek());
	
	}
}
