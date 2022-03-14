package linkedlistoo;

import java.util.Scanner;

public class Circular_linked {
	static l last=null; static l Mainroot=null;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		l head=null;
		l root =createl(head,1);
//		root.left=last;
		System.out.println("shdids");		
		System.out.println("shdids");		
	}	 
	public static l createl(l head,int count) {
		int data;
		l root = null;
		System.out.println("Enter data");
		data = sc.nextInt();
		if (data == -1) {
			return null;}
		root = new l(data);
		root.left = head;
		head = root;
		if(count ==1) {
			Mainroot =	root.right = createl(head,count+1);
		}
		else {
		root.right = createl(head,count);}
		if(root.right==null) {
			last = root;
			root.right=Mainroot;
		}
		if(root.left==null) {
			root.left=last;
		}
		return root;
	}
}
class l{
	l left;
	int data;
	l right;
	public l(int data) {
		this.data=data;
	}
}
