package map;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class D_stack_queue_dequeue {
	// Dequeue means add and remove from both front and rear
	// dequeue stack queue
	// size() size() size()
	// isEmpty isEmpty isEmpty
	// insert_first - - Insert_last
	// pust() Enqueue()
	// Remove_first - Dequeue()
	// Remove_last pop() - insetFront():
	//
	// Adds an item at the front of Deque.
	/// insertRear(): Adds an item at the rear of
	// Deque. deleteFront(): Deletes an item from front of Deque. deleteRear():
	// Deletes an item from rear of Deque. ---- getFront(): Gets the front item from
	// queue. getRear(): Gets the last item from queue. isEmpty(): Checks whether
	// Deque is empty or not. isFull(): Checks whether Deque is full or not.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque<>();
		HashSet<Integer> set = new HashSet<>();

		int n = sc.nextInt();
		int m = sc.nextInt();
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			int input = sc.nextInt();

			deque.add(input);
			set.add(input);

			if (deque.size() == m) {
				if (set.size() > max)
					max = set.size();
				int first = deque.remove();
				if (!deque.contains(first))
					set.remove(first);
			}
		}

		System.out.println(max);

	}
}
