package stack__queue;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Stack;

public class Merge_Interals {
	public static void main(String[] args) {
		LinkedList<interval> l = new LinkedList<interval>();
		l.add(new interval(1,2));
		l.add(new interval(1,3));
		l.add(new interval(1,4));
		l.add(new interval(2,8));
		mergeIntervals(l);
		
		System.out.println("s");
	}
	public static void mergeIntervals(LinkedList<interval> l) {
	Collections.sort(l,Comparator.comparingInt(a->a.f));
		Stack<interval> st = new 	Stack();
		for(interval cur : l) {
			if(st.empty() || st.peek().f<cur.f) {
				st.push(cur);
			}
			if(st.peek().l<cur.l) {
				st.peek().l = cur.l;
			}
		}
		while(!st.empty()) {
			System.out.println('k');
			System.out.println(st.pop());
		}
		System.out.println("s");
	}
}
class interval {
	int f; int l;
	public interval(int i, int j) {
		this.f = i; this.l = j;
	}
	public String toString() {
		return  f + "  " +l;
		
	}
	

}