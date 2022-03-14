package queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
/* 
Implement Queue using Stack  
Implement "n" queue in an array
Implement a Circular queue
LRU Cache implementation
Reverse a Queue using recursion
Reverse the first “K” elements of a queue
Interleave the first half of the queue with second half
//--get length ad divide and  1 to 5 and 5 10oney one both value of 
Find the first circular tour that visits all Petrol Pumps
Minimum time required to rot all oranges
Distance of nearest cell having 1 in a binary matrix
First negative integer in every window of size “k”
Check if all levels of two trees are anagrams or not.-important
Sum of minimum and maximum elements of all subarrays of size “done use for lopp and find total min and max in size of k 
Minimum sum of squares of character counts in a given string after removing “k” characters.
Queue based approach or first non-repeating character in a stream.
Next Smaller Element
 */
public class Imp_Que_using_stack {
	public static void main(String[] args) {
		System.out.println(args);
//		Deque<Integer> dqu = new ArrayDeque<Integer>();
//		Stack<Integer> qu = new Stack<Integer>();
//		System.out.println(qu.po);
		Queue<Integer> qu1 = new LinkedList<Integer>();
		qu1.add(10);
		qu1.add(30);
//		System.out.println(st1.hashCode());
		Stack<Integer> st1 = new Stack<Integer>();
		st1.add(10);//0
		st1.add(50);//1
		st1.add(10);//2
		st1.add(50);//3
		st1.add(10);//4
		st1.add(50);//5
		st1.add(10);//6
		st1.add(10);//7	
		System.out.println(st1);
	}

	static Scanner sc = new Scanner(System.in);

	public static void push(Stack<Integer> qu) {
		int n = Integer.parseInt(sc.nextLine());
		if (n == -1) {
			qu.push(n);
		} else {
			System.out.println("--Ok--");
		}
	}

	public static void peek(Stack<Integer> qu) {
		System.out.println(qu.peek() == null ? "no elements " : " " + qu.peek());
	}
	public static int pop(Stack<Integer> qu) {
		if (qu.pop() == null)
			return 0;
		return qu.pop();
	}
	public static void printQu(Stack<Integer> qu) {
		
	}
}
