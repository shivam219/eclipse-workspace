package DS;

import java.util.Scanner;

class Node {
	protected int data;
	protected Node link;

	public Node() {
		link = null;
		data = 0;
	}

	public Node(int d, Node n) {
		data = d;
		link = n;
	}

	public void setLink(Node n) {
		link = n;
	}

	public void setData(int d) {
		data = d;
	}

	public Node getLink() {
		return link;
	}

	public int getData() {
		return data;
	}

}

public class Linkedlist1 {

	protected Node start;
	protected Node end;
	public int size;

	public Linkedlist1() {
		start = null;
		end = null;
		size = 0;
	}

	public boolean isEmpty() {
		return start == null;
	}

	public int getSize() {
		return size;
	}

	public void insertAtStart(int val) {
		Node ptr = new Node(val, null);
		size++;
		if (start == null) {
			start = ptr;
			end = start;

		} else {
			ptr.setLink(start);
			start = ptr;
		}
	}

	public void insertAtEnd(int val) {
		Node ptr = new Node(val, null);
		size++;
		if (start == null) {
			start = ptr;
			end = start;
		} else {
			end.setLink(ptr);
			end = ptr;
		}

	}

	public void insertAtPos(int val, int pos) {
		Node ptr = new Node(val, null);
		Node ptr1 = start;
		pos = pos - 1;
		for (int i = 1; i < size; i++) {
			if (i == pos) {
				Node tmp = ptr.getLink();
				ptr.setLink(ptr);
				ptr.setLink(tmp);
				break;
			}
			ptr = ptr.getLink();
		}
		size++;
	}

	public void deleteAtPos(int pos) {
		if (pos == 1) {
			start = start.getLink();
			size--;
			return;
		}
		if (pos == size) {
			Node s = start;
			Node t = start;
			while (s != end) {
				t = s;
				s = s.getLink();
			}
			end = t;
			end.setLink(null);
			size--;
			return;
		}
		Node ptr = start;
		pos = pos - 1;
		for (int i = 1; i < size - 1; i++) {
			if (i == pos) {
				Node tmp = ptr.getLink();
				tmp = tmp.getLink();
				ptr.setLink(tmp);
				break;
			}
			ptr = ptr.getLink();
		}
		size--;
	}

	public void display() {
		System.out.print("\n singly linked list=");
		if (size == 0) {
			System.out.print("empty\n");

			return;
		}
		if(start.getLink()==null) {
			System.out.print(start.getData());
			return;
		}
		Node ptr=start;
		System.out.print(start.getData()+"->");
		ptr=start.getLink();
		while(ptr.getLink()!=null) {
			System.out.print(ptr.getData()+"->");
			ptr=ptr.getLink();
		
		}
		System.out.print(ptr.getData()+"\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Linkedlist1 linkedlist=new Linkedlist1();
		System.out.println("singly linked list test\n");
		char ch;
		do {
			System.err.println("\n singly linked list operations\n");
			System.out.println("1 insert at beginng");
			System.out.println("2 insert at end");
			System.out.println("3 insert at position");
			System.out.println("4 delete at position");
			System.out.println("5 check empty");
		    System.out.println("6 get size");
		    int choice=sc.nextInt();
		    switch(choice) {
		    case 1:
		    	System.out.println("enter integer element to insert");
		    	linkedlist.insertAtStart(sc.nextInt());
		    	break;
		    case 2:
		    	System.out.println("enter integer element to insert");
		    	linkedlist.insertAtEnd(sc.nextInt());
		    	break;
		    case 3:
		    	System.out.println("enter integer element to insert");
		    	int num=sc.nextInt();
		    	System.out.println("enter position");
		    	int pos=sc.nextInt();
		    	if(pos<=1 || pos>linkedlist.getSize())
		    		System.out.println("invalid position\n");
		    	else 
		    		linkedlist.insertAtPos(num, pos);
		    	break;
		    case 4:
		    	System.out.println("enter position");
		    	int p=sc.nextInt();
		    	if(p<1||p>linkedlist.getSize())
		    		System.out.println("invalid position\n");
		    	else linkedlist.deleteAtPos(p);
		    	break;
		    case 5:
		    	System.out.println("empty status="+linkedlist.isEmpty());
		    	break;
		    case 6:
		    	System.out.println("size="+linkedlist.getSize()+"\n");
		    	
		    	default:
		    		System.out.println("wrong entry \n");
		    		break;
		  
		    }
		    linkedlist.display();
		    System.out.println("\n do you want to continue (type y or n)\n");
		    ch=sc.next().charAt(0);

		}while(ch=='Y'||ch=='y');
		
	}

}
