package linkedlistoo;

import java.math.BigInteger;

public class Mutplicataion_of2_list {
	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {
		NodeeHead head1 = null;
		NodeeHead head2 = null;
		deletion_k_cycle ob = new deletion_k_cycle();
		head1 = ob.addHead(head1, 2);
		head1 = ob.addHead(head1, 1);
		head2 = ob.addHead(head2, 2);
		head2 = ob.addHead(head2, 1);

		long l = multiplyTwoLists(head1, head2);
		System.out.println(l);

	}

	static long multiplyTwoLists(NodeeHead l1, NodeeHead l2) {
		long N = 1000000007;
		long num1 = 0, num2 = 0;

		while (l1 != null || l2 != null) {
			if(l1 != null) {
				num1 = ((num1) * 10) % N + l1.data;
				l1 = l1.next;
			}
			if (l2 != null) {
				num2 = ((num2) * 10) % N + l2.data;
				l2 = l2.next;
			}
		}
		return ((num1 % N) * (num2 % N)) % N;
	}
}
