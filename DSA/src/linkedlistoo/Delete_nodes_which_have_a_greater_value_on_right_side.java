package linkedlistoo;

import java.util.ArrayList;

public class Delete_nodes_which_have_a_greater_value_on_right_side {
	static NodeeHead head = null;
	public static void main(String[] args) {
		NodeeHead head1 = null;
		
//		NodeeHead head2 = null;
		deletion_k_cycle ob = new deletion_k_cycle();
//		12 15 10 11 5 6 2 3
		head1 = ob.addHead(head1, 3);
		head1 = ob.addHead(head1, 2);
		head1 = ob.addHead(head1, 6);
		head1 = ob.addHead(head1, 5);
		head1 = ob.addHead(head1, 11);
		head1 = ob.addHead(head1, 10);
		head1 = ob.addHead(head1, 15);
		head1 = ob.addHead(head1, 12);
		ob.printNodeeHead(head1);
		head=head1;
//		NodeeHead after =deleteNodeeHeadsOnRightSide(head1);
		NodeeHead after =deleteRight(head1);
		ob.printNodeeHead(after);
//		String txt ="aabaaaaabbabcd";
//		String pat = "abcd";
//		System.out.println(txt);
//		System.out.println(pat);
//		findPattern(txt.toCharArray(),pat.toCharArray());

		
		}
// ----------------woik--------------
	public static NodeeHead deleteRight(NodeeHead head) {
		if(head==null || head.next==null) {
			return head;
		}
		if(head!=null) {
			head.next = deleteRight(head.next);
		}
		if(head.data<head.next.data) {
			return head.next;
		}
		return head;
		
	}
	
//----fully woriking
public static void findPattern(char[] txt, char []pat) {
		int len =txt.length; int j = 0;
		for(int i = 0; i<len;i++) {
			
			if(txt[i] == pat[j]) {
				j++;
			}
			else if ( txt[i] == pat[j] && txt[i]==pat[j-1]) { j--; i--;}
			else if (txt[i]!=pat[j]) {
				j=0;
			}
			if(j==pat.length) {
				int  r = i-(j-1);
				System.out.print(r+1 +" ");
				j=0;
			}
		}
	}

//----------------------fully working programmed--------------------------------------------------------------
	 public static NodeeHead deleteNodeeHeadsOnRightSide(NodeeHead head){
         if(head == null || head.next == null) return head;
 
         NodeeHead newN = deleteNodeeHeadsOnRightSide(head.next);
         
         if(newN.data > head.data) return newN;
         head.next = newN;
         return head;
    }	
	
//----------------------work when you to delete left less values-------------------------------------------------------
	static int arr[] = new int [10];
	static int i=0;
	static ArrayList<Integer> ar= new  ArrayList<Integer>();
	public static NodeeHead delLeftLessValue(NodeeHead head1) {
		//this programm follow recursion but double is led you into stack overflow elee
		NodeeHead cur = head1;
		while(cur.next!=null) {
			if(cur.data<cur.next.data) {
//				arr[i]=cur.data;--arr
				ar.add(cur.data);
//				i++; --arr
			}cur = cur.next;
		}//i--; -- arr
		head1 = deleteAllArr(head1);
		return head1;
	}
	public  static NodeeHead deleteAllArr(NodeeHead root) {
		if (root == null || root.next == null)
			return root;
		if(root!=null ) {
			root.next= deleteAllArr(root.next);
		}
//		if(root.data==arr[i]) {i--; -- arr
		if(ar.contains(root.data)) {
		root = root.next;
			return root; 
		}
		return root;
	}
}
