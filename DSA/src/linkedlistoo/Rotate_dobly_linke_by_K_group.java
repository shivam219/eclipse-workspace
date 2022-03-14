package linkedlistoo;

public class Rotate_dobly_linke_by_K_group {
static 	deletion_k_cycle ob = new deletion_k_cycle();
	public static void main(String[] args) {
		NodeeHead h = null;
		h=ob.addHead(h,2);
		h=ob.addHead(h,4);
		h=ob.addHead(h,8);
		h=ob.addHead(h,10);
		
		NodeeHead rev_group_by_k = RevGroupByK(h, 2);
		System.out.println("s");
		System.out.println("s");
	}

	public static NodeeHead RevGroupByK(NodeeHead h, int k) {
		NodeeHead cur = h,idx =null; int count = 0;
		NodeeHead newNode = null;
		while(cur!=null && count<k) {
			if(count==0){
				newNode = ob.addHead(newNode, cur.data); idx =newNode;}
			else newNode = ob.addHead(newNode, cur.data);
				cur=cur.next;
				count++;
		}
		if(cur==null) {
			return newNode;
		}
		if(cur.next==null) {
			 newNode = ob.addHead(newNode, cur.data); idx.next=newNode; cur=cur.next;
		}
		if(cur!=null) {
			 idx.next=RevGroupByK(cur,k);
		}
		return newNode;
	}
}
