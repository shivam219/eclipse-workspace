package stack__queue;

public class Imp_st_Link_node {
	stt root = null;

	public static void main(String[] args) {
		Imp_st_Link_node st = new Imp_st_Link_node();
		st.push(10);
		st.push(10);
		st.push(20);
		System.out.println(st);
	}

	public void push(int data) {
		stt node = new stt(data);
		if (root == null) {
			root = node;
		} else {
			stt temp = root;
			root = node;
			root.next = temp;
		}
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		stt st = root;
		while (st != null) {
			sb.append(st.data + " ");
			st = st.next;
		}
		return sb + " ";
	}
}

class stt {
	int data = 0;
	stt next;

	public stt(int val) {
		this.data = val;
	}
}
