package linkedlistoo;

public class Middle_element_in_linkedList {

	public static void main(String[] args) {
		dol_sort_int ob = new dol_sort_int();
		link l = ob.createLink();
		int mid  = 1+ (ob.lenlist(l)/2);
		System.out.println(Middle(l,mid));
	}

	public static int Middle(link l, int mid) {
		int count =1;int elem=0;
		while( l.right!=null||l.right==null) {
			if(count==mid) {
			elem = l.data;break;
			}
			count++;
			l=l.right;
		}
		return elem;
	}	
	

}
