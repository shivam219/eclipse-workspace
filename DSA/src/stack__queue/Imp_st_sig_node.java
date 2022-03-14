package stack__queue;

public class Imp_st_sig_node {
	st root;

	public void print() {
		st idx = root;
		while (idx != null) {
			System.out.println(idx.data + " ");
			idx = idx.next;
		}
	}

	public boolean isEmpty() {
		if (root == null) {
			return true;
		} else
			return false;
	}

	public void push(int data) {
		st node = new st(data);
		if (root == null) {
			root = node;
		} else {
			st temp = root;
			root = node;
			node.next = temp;
		}
	}

	public int pop() {
		int popped = Integer.MIN_VALUE;
		if (root == null) {
			System.out.println("Stack is Empty");
		} else {
			popped = root.data;
			root = root.next;
		}
		return popped;
	}

	public int peek() {
		if (root == null) {
			System.out.println("Stack is empty");
			return Integer.MIN_VALUE;
		} else {
			return root.data;
		}
	}

	public static void main(String args[]) {
		Imp_st_sig_node st = new Imp_st_sig_node();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);// mid is 40
		st.mid(st.root);
//		System.out.println(st.pop() + " popped from stack");
//		System.out.println("Top element is " + st.peek());
		st.print();
		System.out.println(st.size(st.root));
	}

	public int mid(st root) {
		int n = size(root)/2;
		if(n<1)return root.data;
		int i =0;
		while(i<=n) {
			if(i==n)return root.data;
			i++; root=root.next;
		}
		return 0 ;
	}

	public int size(st root) {
		if(root==null)return 0;
		return 1 + size(root.next);
	}
}

class st {
	int data;
	st next;

	st(int data) {
		this.data = data;
	}

	st(int data, st head) {
		this.data = data;
	}
}