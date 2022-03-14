package linkedlistoo;

public class Sort_till_and_roted_till_k {
	static link head = null;
	static link root= null;

	public static void main(String[] args) {
		dol_sort_int ob = new dol_sort_int();
		head = ob.createLink(root);
		link rev=  rotate(head ,3);
		System.out.println(ob.printLink(head));
//		link sort =sortList(root,root.right,2, 0);
//		System.out.println(ob.printLink(root));
//		System.out.println(ob.printLink(sort));

	}

//	private static link  sortTillK(link cur,link idx , int k,int count) {
//		if(cur.right!=null) {
//			while(idx!=null) {
//				if(cur.data>idx.data &&count<=k) {
//					int temp = cur.data;
//					cur.data= idx.data;
//					idx.data=temp;
//				}
//				idx=idx.right;
//			}
//			sortTillK(cur.right, cur.right.right, k,count+1);
//		}
//		return cur;
//	}
	static link rotate(link head, int N) {
		if (N == 0)
			return null;
		link current = head;
		int count = 1;
		while (count < N && current != null) {
			current = current.right;
			count++;
		} 
		if (current == null)
			return null;
		link Nthlink = current;
		while (current.right != null)
			current = current.right;
		current.right = head;
		(head).left = current;
		head = Nthlink.right;
		(head).left = null;
		Nthlink.right = null;
		return head;
	}

	static link sortList(link cur, link idx, int k, int count) {
		if (cur.right != null) {
			while (idx != null) {
				if (cur.data > idx.data && count <= k) {
					int temp = cur.data;
					cur.data = idx.data;
					idx.data = temp;
				}
				idx = idx.right;
			}
			sortList(cur.right, cur.right.right, k, count + 1);
		}
		return cur;
	}
}
