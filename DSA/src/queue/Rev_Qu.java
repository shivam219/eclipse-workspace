package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Rev_Qu {
	public static void main(String[] args) {	
		Circular_linkedlis ob = new Circular_linkedlis();
		ob.add(10);
		ob.add(20);
		ob.add(30);
		ob.add(40); 
		ob.add(50);
		qu root = ob.root;
//		System.out.println(RevQu(root));//statement which are asking to parmare not applicable
		ob.printQu(root);
//		RevQu(root);
//		System.out.println("Reverse");
//		ob.printQu(root);
		System.out.println("\nREever till  4");
		RevK(root, 4);
		ob.printQu(root);
	}		
	// parameter
	static Deque<Integer> de = new ArrayDeque<Integer>();
	public static void RevQu(qu root) {
		if(root==null)return ;
		de.add(root.data);
		RevQu(root.next);
		root.data= de.removeFirst();
	} 
	// rev till k
	static int i =0;
	static Deque<Integer> de2 = new ArrayDeque<Integer>();
	public static void RevK(qu root,int k) {
		if(k==i) {return ;}
		i++;
		de2.add(root.data);
		RevK(root.next,k);
		root.data = de2.removeFirst();
	}
	
}
