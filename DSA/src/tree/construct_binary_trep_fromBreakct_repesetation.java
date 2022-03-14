package tree;

public class construct_binary_trep_fromBreakct_repesetation {
	public static void main(String[] args) {
		String str = "4(2(3)(1))(6(5))";
		Node node = new Node(Integer.parseInt(String.valueOf(str.charAt(0))));
		solve(node, null, 0, 0, false);
	}
	static int n =10;
	static Node nod = null;
	static void solve(Node node, String str, int i, int count,boolean flag) {
		if(str.length()==0)return ;
		if(count==0)return ;
		    if(flag) {
			if(str.charAt(i)=='(') {
				nod = new Node(Integer.parseInt(String.valueOf(str.charAt(i))));
				count++;
				solve(node.left, str.substring(i, n), i, count, flag);
			}}
			else 
			if(str.charAt(i)=='('){
				nod = new Node(Integer.parseInt(String.valueOf(str.charAt(i))));
				count++;
				solve(node.right, str.substring(i, n), i, count, flag);
				
			}
		}
	}

