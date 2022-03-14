package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Rev_2_que {
	public static void main(String[] args) {
		Circular_linkedlis ob = new Circular_linkedlis();
		ob.add(10);
		ob.add(20);
		ob.add(30);
		ob.add(40); 
		ob.add(50);
		qu root = ob.root;
		Rev2(root);
		System.out.println("hii");
		ob.printQu(root);
	}

	public static void Rev2(qu root) {
		qu idx = root;
		while(idx!=null) {
			RevK(idx, 0,2);
			idx = idx.next.next;
				 // 10   20   30 
			if(idx.next==null) {
				idx = null;
			}
			
		}
	}
	static Deque<Integer> de = new ArrayDeque<Integer>();
	public static void RevK(qu root, int i , int k) {
		if(k==i)return ;
		de.add(root.data);
		RevK(root.next,i+1,k);
		root.data = de.removeFirst();
	}
}






