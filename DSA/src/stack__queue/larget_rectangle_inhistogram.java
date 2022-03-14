package stack__queue;

import java.util.Stack;

public class larget_rectangle_inhistogram {
	// The main function to find the maximum rectangular area under given
	// histogram with n bars
	static int getMaxArea(int hist[], int n) {
		Stack<Integer> st = new Stack<>();
		int max_area = 0; // Initialize max area
		int top; // To store top of stack
		int top_area; // To store area with top bar as the smallest bar
		int i = 0;
		while (i < n) {
			// If this bar is higher than the bar on top stack, push it to stack
			if (st.empty() || hist[st.peek()] <= hist[i])
				st.push(i++);
			// If this bar is lower than top of stack, then calculate area of rectangle
			// with stack top as the smallest (or minimum height) bar. 'i' is
			// 'right index' for the top and element before top in stack is 'left index'
			else {
				top = st.peek(); // store the top index
				st.pop(); // pop the top
				// Calculate the area with hist[tp] stack as smallest bar
				top_area = hist[top] * (st.empty() ? i : i - st.peek() - 1);
				// update max area, if needed
				if (max_area < top_area)
					max_area = top_area;
			}
		}
		// Now pop the remaining bars from stack and calculate area with every
		// popped bar as the smallest bar
		while (st.isEmpty() == false) {
			top = st.peek();
			st.pop();
			top_area = hist[top] * (st.empty() ? i : i - st.peek() - 1);

			if (max_area < top_area)
				max_area = top_area;
		}
		return max_area;
	}public static void main(String[] args) {
		int hist[] = { 6, 2, 5, 4, 5, 1, 6 };
		System.out.println("Maximum area is " + getMaxArea(hist, hist.length));
	}
}
