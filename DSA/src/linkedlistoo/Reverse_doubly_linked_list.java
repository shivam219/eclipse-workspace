package linkedlistoo;

public class Reverse_doubly_linked_list {
	public static void main(String[] args) {
		link head =null;
		dol_sort_int ob= new dol_sort_int();
		link root = ob.createLink(head);
		System.out.println(sortList(root,root.right));
		System.out.println(ob.printLink(root));
		
	}
	public static link sortList(link head) {
		link current = head, index = null;
		int temp;
		if (head == null) {
			return null;
		} 
		else {
			while (current != null) {
				index = current.right;
				while (index != null) {
					if (current.data > index.data) {
						temp = current.data;
						current.data = index.data;
						index.data = temp;
					}

					index = index.right;
				}
				current = current.right;
			}
		}
		return current;
	}
	public static link sortList(link cur, link idx) {
		if(cur.right!=null) {
			while(idx!=null) {
			if(cur.data>idx.data) {
				int temp= cur.data;
				cur.data= idx.data;
				idx.data=temp;
			}
			idx=idx.right;
		}
		sortList(cur.right,cur.right.right);
	}
		return cur;
	}
}
