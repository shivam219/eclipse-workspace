package linkedlistoo;

public class Delete_K_node extends deletion_k_cycle {
	public static void main(String[] args) {
		deletion_k_cycle ob = new deletion_k_cycle();
		Nodee h = head;
		ob.add(4);
		ob.add(3);
		ob.add(2);
		ob.add(1);
		Nodee K_del =deleteKNode(head, 5);
		System.out.println("s");
	}

	public static Nodee deleteKNode(Nodee head, int k) {
		if (head.data == k) {
			head.next = head;
		}
		Nodee cur = head,idx = head.next;
		while (idx != null) {
			if(idx.data==k) {
				cur.next= idx.next;
				break;
			}
			cur=cur.next;
			idx=idx.next;
		}
		if(idx==null) {
			System.out.println("no found");;
		}
		return head;
	}
}
