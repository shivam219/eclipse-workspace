package stack__queue;

import java.util.Stack;

public class Sort_arr_using_stack {
	static int i = 1;
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>(); // it work like quick
		st.add(10);st.add(3);st.add(8);st.add(6);
		System.out.println(st.peek());
		Sort_arr_using_stack ob = new Sort_arr_using_stack();
		ob.revSt(st);
		for (int  i : st ) {
		System.out.println(i);}
		System.out.println(st);

	}
	void revSt(Stack<Integer> st ) {
		if(st.empty())return ;
		int x = st.pop();
		revSt(st);
		if(!st.empty()) {
			sort(st,x);
		}
		else st.push(x);
	}
	public void sort(Stack<Integer> st, int x) {
		if(st.empty()) {
			st.push(x);return ;
		}
		int idx = 0 ;
		if(st.peek()<x) {
			idx = st.pop();
			sort(st,x);
		}
		if(st.peek()>x) {
			st.push(x);
		}
		else st.push(idx);
	}
}
