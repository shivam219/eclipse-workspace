package linkedlistoo;

public class Reverse_linked_list_in_group_of_k {
	public static void main(String[] args) {
		dol_sort_int ob = new dol_sort_int();
		link head  = null;//dolby - previusi addres store in left of next node
		link  l = ob.createLink(head);
//		link k_th= lennod(l,3);//greate but we can do by reverse till k ;
		link k_th= lenOfK(l,3);//greate but we can do by reverse till k ;
		sortTillK(l,k_th);
		//send k to sort then print all element
		System.out.println(ob.printLink(l));
//		System.out.println(sortTillK(l, k_th));
		}
	public static void sortTillK(link l, link k_th) {
		link cur = l, idx = null, last = k_th.right;
		int temp;
		if(l==null) System.out.println("null list");;
		while(cur!= k_th){//for 1st pointer
			idx = cur.right;//safty only we are using cur.right not idx.right
			while(idx != last) {
				if(cur.data>idx.data) {
					temp = cur.data;
					cur.data= idx.data;
					idx.data= temp;
				}
				idx=idx.right;
			}
			cur=cur.right;
		}
	}

	public static link lenOfK(link l, int k) {
		int count = 1;
		if(l == null) return null;
		else while(l!=null && count<=k) {
			l= l.right;count++;}
	return l.left;
	}
    public static link lennod(link head,int k){
        link root = null;int count=1;
        while(head!=null|| head==null){
           if(count==k){
               root = head;
                return root;
            }
            count++;
            head = head.right;
          }
        return root;
    }
}
