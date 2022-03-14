package linkedlistoo;

class Nodd {
	int data;
	Nodd next;

	Nodd(int d) {
		data = d;
		next = null;
	}
}

public class Delete_node_k_single {
	static Nodd head;


	Nodd deleteNode(int key, Nodd head) {
		Nodd first = head;
		Nodd second=head,second2 = head;
		for (int i = 0; i < key; i++) {
			if(i<=key&& second ==null) {
				second2=second2.next;
				second = second2;
				break;
			}
			else if(second.next == null) {
				if (i == key-1 ) {
					head = head.next;
				return head;}
			}
			second = second.next;
		}
		while (second.next != null) {
			first = first.next;
			second = second.next;
		}
		first.next = first.next.next;
		return head;
	}

	public void push(int new_data) {
		Nodd new_node = new Nodd(new_data);
		new_node.next = head;
		head = new_node;

	}

	public void printList() {
		Nodd tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + " ");
			tnode = tnode.next;
		}
	}

	public static void main(String[] args) {
		Delete_node_k_single llist = new Delete_node_k_single();
//		llist.push(7);
		llist.push(1);
//		llist.push(3);
		llist.push(2);
		System.out.println("\nCreated Linked list is:");
		llist.printList();
		int N = 3;
		Nodd l = llist.deleteNode(N, head);
		System.out.println("\nLinked List after Deletion is:");
		llist.printList();
		dol_sort_int ob = new dol_sort_int();
		link ln = ob.createLink();
		link lnAfterDelete = deleteLink(ln);

	}

	public static link deleteLink(link ln) {
		
		return null;
	}
}
