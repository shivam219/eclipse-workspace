package linkedlistoo;

public class Segreted_Even_odd {

	public static void main(String[] args) {
		deletion_k_cycle ob = new deletion_k_cycle();
		NodeeHead head = null;
		head = ob.addHead(head, 7);
		head = ob.addHead(head, 5);
		head = ob.addHead(head, 3);
		head = ob.addHead(head, 2);
		head = ob.addHead(head, 1);
		NodeeHead sege = segregateEvenOdd(head);
		ob.printNodeeHead(sege);
	}

	public static NodeeHead segregateEvenOdd(NodeeHead head) {

		NodeeHead eS = null;
		NodeeHead eE = null;
		NodeeHead oS = null;
		NodeeHead oE = null;
		NodeeHead cur = head;

		while (cur != null) {
			int element = cur.data;

			if (element % 2 == 0) {

				if (eS == null) {
					eS = cur;
					eE = eS;
				} else {
					eE.next = cur;
					eE = eE.next;
				}

			} else {

				if (oS == null) {
					oS = cur;
					oE = oS;
				} else {
					oE.next = cur;
					oE = oE.next;
				}
			}
			cur = cur.next;
		}

		if (oS == null || eS == null) {
			return head;
		}

		eE.next = oS;
		oE.next = null;
		return head = eS;
	}

}
