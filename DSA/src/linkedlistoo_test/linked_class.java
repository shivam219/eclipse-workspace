package linkedlistoo_test;

import java.util.Scanner;

public class linked_class {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
//		nodd node = new  noddd().createLink();
//		nod obj = new nod();
//		nod n =	obj.createLink();//return null
		node n = nodeCreate.createlink();
		nodeCreate.printSinglylinked(n);
		
	}
}
class node{
	int n;
	node next;
	public node(int n) {
		this.n = n;
	}
}
class nodeCreate {
	static Scanner sc = new Scanner(System.in);
	public static node createlink() {
		System.out.println("Enter no : ");
		int n = sc.nextInt();//10
		if(n==-1) {
		return null;
		}		
		node nod = new node(n); 
		nod.next= createlink();
		return nod;
	}
	public static void printSinglylinked(node n) {
		node idx = n;
		while(idx.next !=null) {
			System.out.println(idx.n);
			idx=idx.next;
		}
		System.out.println(idx.n);
	}
}







