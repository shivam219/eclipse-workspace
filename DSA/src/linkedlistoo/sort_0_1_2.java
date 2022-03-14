package linkedlistoo;

public class sort_0_1_2 {
	public static void main(String[] args) {
		deletion_k_cycle ob = new deletion_k_cycle();
		NodeeHead h = null;
		h = ob.addHead(h, 2);
		h = ob.addHead(h, 0);
		h = ob.addHead(h, 1);
		h = ob.addHead(h, 0);
		h = ob.addHead(h, 2);
		h = ob.addHead(h, 1);
		h = ob.addHead(h, 0);
		h = ob.addHead(h, 2);
		NodeeHead  sort = sortList(h);
		ob.printNodeeHead(sort);	
	}
	public static NodeeHead sortList(NodeeHead head) {
		int count[] = { 0, 0, 0 };
		NodeeHead ptr = head;
		while (ptr != null) {
			count[ptr.data]++;
			ptr = ptr.next;
		}

		int i = 0;
		ptr = head;
		while (ptr != null) {
			if (count[i] == 0)
				i++;
			else {
				ptr.data = i;
				--count[i];
				ptr = ptr.next;
			}
		}
		return head;

	}
}
