package queue;
import java.util.ArrayDeque;
public class Arraydeque {
	

	

	    public static void main(String[] args) {
	        // Creating Dequeue using the ArrayDeque class
	      ArrayDeque<Integer> numbers = new ArrayDeque<Integer>();
	     
	        // add elements to the Dequeue
	        numbers.offer(1);
	        numbers.offerLast(2);
	        numbers.offerFirst(3);
	        System.out.println("Deque: " + numbers);

	        // Access elements of the Dequeue
	        int firstElement = numbers.peekFirst();
	        System.out.println("First Element: " + firstElement);

	        int lastElement = numbers.peekLast();
	        System.out.println("Last Element: " + lastElement);

	        // Remove elements from the Dequeue
	        int removedNumber1 = numbers.pollFirst();
	        System.out.println("Removed First Element: " + removedNumber1);

	        int removedNumber2 = numbers.pollLast();
	        System.out.println("Removed Last Element: " + removedNumber2);

	        System.out.println("Updated Deque: " + numbers);
	    }
	}

