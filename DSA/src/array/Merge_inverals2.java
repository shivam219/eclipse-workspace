package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

class Interval {
	int begin, end;

	Interval(int begin, int end) {
		this.begin = begin;
		this.end = end;
	}

	@Override
	public String toString() {
		return "{" + begin + ", " + end + "}";
	}
}

class Merge_inverals2 {
	// Function to merge overlapping intervals
	public static void mergeIntervals(List<Interval> intervals) {
		// sort the intervals in increasing order of their starting time
		Collections.sort(intervals, Comparator.comparingInt(a -> a.begin));

		// create an empty stack
		Stack<Interval> stack = new Stack();

		// do for each interval
		for (Interval cur : intervals) {
			// if the stack is empty or the top interval in the stack does not overlap
			// with the current interval, push it into the stack
			if (stack.empty() || cur.begin > stack.peek().end) {
				stack.push(cur);
			}

			// if the top interval of the stack overlaps with the current interval,
			// merge two intervals by updating the end of the top interval
			// to the current interval
			if (stack.peek().end < cur.end) {
				stack.peek().end = cur.end;
			}
		}

		// print all non-overlapping intervals
		while (!stack.empty()) {
			System.out.println(stack.pop());
		}
	}

	public static void main(String[] args) {
		List<Interval> intervals = Arrays.asList(new Interval(1, 5), new Interval(2, 3), new Interval(4, 6),
				new Interval(7, 8), new Interval(8, 10), new Interval(12, 15));

		mergeIntervals(intervals);
	}
}