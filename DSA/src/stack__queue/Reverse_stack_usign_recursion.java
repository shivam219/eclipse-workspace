package stack__queue;

import java.util.Stack;

public class Reverse_stack_usign_recursion {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		st.add(1);st.add(2);st.add(3);st.add(4);
		System.out.println(st);// print 
		revStRecui(st);
		System.out.println(st);
	}


	public static void revStRecui(Stack<Integer> st) {
		if(st.empty())return ;
		int x = st.pop();
		revStRecui(st);
		if(!st.empty()) { //treu - is empty
			put(st,x);
		}
		else st.push(x);
	}
	public static void put(Stack st, int x){
		if(st.empty()) {st.push(x); return ;}
		int idx = (int) st.pop();
		put(st, idx);
		st.push(idx);
	}


	public static  <T> T mi() {
		T t = (T) "shivam";
//		T t1 = 100;//no o
		return t;
	
	} 
	static Stack<Integer> s = new Stack<Integer>();
	public static void revStusSt(Stack<Integer> st) {
		if (st.isEmpty())
			return;

		s.push(st.pop());
		revStusSt(st);
		return;
	}
}
