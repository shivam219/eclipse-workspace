package queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueu { /// blocking_Q extends aaray_BLocking_Q /// or extends LinkedBlockQueue

	/// 3 types of methods
	/// method that return value
	/// method that throw an exception
	//// method that stop execution of program when condition when value is satisfy

	public static void main(String[] args) {
		// Create a blocking queue using the ArrayBlockingQueue
		BlockingQueue<Integer> numbers = new ArrayBlockingQueue<>(5);

		try {
			// insert element to blocking queue
//			numbers.put(2);
//			numbers.put(1);
//			numbers.put(3);
			System.out.println("BLockingQueue: " + numbers);

			// Remove Elements from blocking queue
			int removedNumber = numbers.remove();
			System.out.println("Removed Number: " + removedNumber);
		}

		catch (Exception e) {
			e.getStackTrace(); /// ______Continue
		}
	}
}
