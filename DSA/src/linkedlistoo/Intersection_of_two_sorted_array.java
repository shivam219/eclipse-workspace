package linkedlistoo;

import java.util.HashSet;

public class Intersection_of_two_sorted_array {

	public static void main(String[] args) {
		dol_sort_int ob = new dol_sort_int();
		add_one_represent_linkedLIst ob2 = new add_one_represent_linkedLIst();
		
		link li1 = ob.createLink();
		link li2 = ob.createLink();
		link domy =Intersection(li1,li2);
//		System.out.println(ob.printLink(domy));
//		link domyReve = Rev(domy);
		
		int k = 3, len = ob.lenlist(li1);
		link ro = RotedTillK(li1,k,len);
		link man = ro;
		link Retect = AddLastListToFirst(li1, ro,man);
//		link domyReve = RevTillK(li1, 3);
//		System.out.println(ob.printLink(domyReve));
		System.out.println("ss");
		
	}
	
public static link RotedTillK(link root,int k,int len) {
	if(root==null)return null;int count=1;
		link idx = root,Nod = null;
		while(idx!=null||idx==null) {
			if(count==k) {
				Nod = idx.right;
				break;
			}
			count++;
			idx = idx.right;
		}
		return Nod;
		}
public static link AddLastListToFirst(link root,link Nod,link man){
	if(Nod.right==null) {
		return Nod.right = root;
	}
 Nod.right = AddLastListToFirst(root, Nod.right,man);
 return Nod;
}

public static link Rev(link root) {
	if(root==null)return null;
	link nod = null;
	while(root!=null||root==null) {
		nod = new link(root.data);
		nod.right= headNod;
		headNod= nod;
		if(root.right==null)break;
		root= root.right;	
	}	
	return nod;
}
public static link RevTillK(link root,int k) {
	if(root==null)return null;
	link idx = root;
	int count = 1;
	link nod = null;
	while(root!=null||root==null) {
		nod = new link(root.data);
		nod.right= headNod;
		headNod= nod;
		if(count==k)break;
		root= root.right;
		count++;
	}
	link revNod = nod;
	while(idx!=null||idx==null) {
		
		if(nod.right==null) {
			nod.right=idx.right;
		
			break;
		}
		idx = idx.right;
		nod = nod.right;
	}
	
	return revNod;
}
static Nod  head;static link head2,headNod= null; 
	private static link Intersection(link li1,link li2) {
		link li3 = null;
		if(li1 == null)return null;
		HashSet<Integer> hs = new HashSet<>();
		while(li1.right!=null || li1.right==null) {
			if(li1.right==null) {
				hs.add(li1.data);
			break;}
			hs.add(li1.data);
			li1 =li1.right;
		}//---done to add first linked list
		
		while(li2.right!=null || li2.right==null) {
			
//			if(hs.contains(li2.data)) {
//				Nod dom = new Nod(li2.data);
//				dom.right= head;
//				head = dom;
//			}
			if(hs.contains(li2.data)) {
				link dom = new link(li2.data);
				dom.right= head2;
				head2 = dom;
			}
			
//			if(li2.right==null) {return head;}
//			li2=li2.right;
//		}
//		return head;
		if(li2.right==null) {return head2;}
		li2=li2.right;
		}
		return head2;
	}
}
class Nod{
	int data ;
	Nod right;
	public Nod(int data){
		this.data=data;
	}
}