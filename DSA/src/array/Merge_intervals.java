package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class Merge_intervals {
	static void mergeIntervals(List<Intervaal> l) {
		Collections.sort(l,Comparator.comparingInt(a->a.begin));// compare from begin index of all class
		Stack<Intervaal> st = new Stack<>();
		for (Intervaal cur: l) {
			if(st.empty()|| cur.begin>st.peek().end)
				st.push(cur);
			if(st.peek().end<cur.end)
				st.peek().end= cur.end;
		}
		while(!st.empty())
			System.out.println(st.pop());
	}
	public static void main(String[] args) {
	 List<Intervaal> intervals = Arrays.asList(new Intervaal(10,20),new Intervaal(5,6),new Intervaal(2,4),new Intervaal(3,5));
	 mergeIntervals(intervals);
	}
}
class Intervaal {
	int begin, end;
	Intervaal(int begin , int end) {
		this.begin= begin;
		this.end= end;
	}
//	@Override
//	public String toString() {
//		return "{"+ begin +", "+ end+"}";
//	}
}
