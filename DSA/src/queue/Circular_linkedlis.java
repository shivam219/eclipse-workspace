package queue;

import java.util.ArrayList;

public class Circular_linkedlis {
	public static void main(String[] args) {
		Circular_linkedlis ob = new Circular_linkedlis();
		ob.add(10);
		ob.add(20);
		ob.add(30);
		ob.add(50);
		System.out.println(ob); 
		ob.removeFirst();
		System.out.println("ss");
		System.out.println("ss");
	}
	private void removeFirst() {
		// TODO Auto-generated method stub
		
	}
	qu root, last,idx;
	
	public void add(int data) {
		if(data ==-1) {
			if(root!=null) {idx.next=root;}
		}else {
			qu q = new qu(data);
			if(root==null) {
				idx = last =root = q;
			}else {
				q.pre = last;
				idx.next = q;idx = idx.next;
				last = idx;
			}
		}
			
	}
	public static void printQu( qu root) {
		while(root!=null) {
			System.out.print(root.data+" ");
			root= root.next;
		}
	}
}

class qu {
	qu next ;
	int data;
	qu pre;
	qu(int data) {
		this.data = data;
	}
}