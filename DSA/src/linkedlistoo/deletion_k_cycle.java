package linkedlistoo;

import java.util.Scanner;

class Nodee {
	Nodee pre=null, next=null;
	int data;
	public Nodee(int data) {
		this.data = data;
	}
}
class NodeeHead{
	NodeeHead pre=null;
	NodeeHead next=null;
	int data;
	public NodeeHead(NodeeHead head,int data) {
		this.data = data;
	}
}
public class deletion_k_cycle {

	static Nodee head = null;
	public void add(int i) {
		Nodee node =  new Nodee(i);
		node.next=head;
		head=node;
	}
	 
	public NodeeHead addHead(NodeeHead head,int data) {
		NodeeHead node =  new NodeeHead(head,data);
		node.next=head;
		head=node;
		return head;
	}
	
	public void printNode(Nodee head2) {
		while(head2!=null) {
			System.out.print(head2.data + " " );
			head2=head2.next;
		}
		System.out.println();
	}
	public void printNodeeHead(NodeeHead head2) {
		while(head2!=null) {
			System.out.print(head2.data + " " );
			head2=head2.next;
		}
		System.out.println();
	}
	private Nodee deleteKNode(Nodee head2, int key) {
		Nodee f = head2,s=head2,s2=head2;
		for(int i =0; i<key;i++) {
			if(i<=key&&s==null) {// k is higher then delete first node
				s2=s2.next;
				s=s2;break;
			}
			else if(s.next==null && i ==key-1) {
				head2=head.next;
				return head2;
			}
			s =s.next;
		}
		while(s.next!=null) {
			s=s.next;
			f=f.next;
		}
		f.next=f.next.next;
		return head2;
	}
	public static void main(String[] args) {
		deletion_k_cycle ob = new deletion_k_cycle();
		ob.add(1);//4
		ob.add(2);//3
		ob.add(3);//2
		ob.add(4);//1
		ob.printNode(head);
		Nodee afterDelNods=ob.deleteKNode(head,4);
		ob.printNode(afterDelNods);
	}
	
}
