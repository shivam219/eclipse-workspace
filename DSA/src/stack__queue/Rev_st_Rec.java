package stack__queue;

import java.util.Stack;

public class Rev_st_Rec {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		st.add(1);st.add(2);st.add(3);st.add(4);
		revStRecui(st);
		System.out.println(st);
	}
	public static void revStRecui(Stack<Integer> st) {
		if(st.empty()){return ;}
		int  x = st.pop();
		revStRecui(st);
		if(!st.empty()) {
			put(st,x);
		}
		else st.push(x);
	}
	public static void put(Stack st, int x){
		if(st.empty()) {st.push(x); return ;}
		int idx = (int) st.pop();
		put(st, x);
		st.push(idx);
	}
}
