package linkedlistoo;

import java.util.Scanner;

public class Find_pair_with_givem_sum_in_ddl {
	public static void main(String[] args) {
		pa_link head=null;
		pa_link root = createpa_link(head);
		int sum= 8;
		sortList(root,root.right,sum);
	}
	
	public static void sortList(pa_link cur, pa_link idx,int sum) {
		if(cur.right!=null) {
			while(idx!=null) {
			if(sum ==cur.data+idx.data &&cur.vi==false && idx.vi==false ) {
				cur.vi=true;idx.vi=true;
				System.out.println(cur.data +"  +  "+idx.data+"  =  "+ sum );
			}
			idx=idx.right;
		}
		sortList(cur.right,cur.right.right,sum);
		}
	}
	static Scanner sc = new Scanner(System.in);
	pa_link head = null;
	 static pa_link createpa_link(pa_link head) {
		int data;
		pa_link root = null;
		System.out.println("Enter data ");
		data = sc.nextInt();
		if (data == -1)
			return null;
		root = new pa_link(data);
		root.left = head;
		head = root;
		root.right = createpa_link(head);
		return root;
	}
	
}
class pa_link {
	 int data ;
	 boolean vi =false;
	 pa_link left,right;
	 public pa_link (int data){
		 this.data=data;
	 }
}