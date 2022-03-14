package linkedlistoo;

public class move_last_to_first{
	public static void main(String[] args) {
		dol_sort_int ob = new dol_sort_int();
	link l = ob.createLink();
		link re =MoveLastToFront(l);
		System.out.println(ob.printLink(re));
	}

	 static link MoveLastToFront(link l) {
		 if(l==null)return null ;
		 link pre= l, idx=l.right;
		 while(idx.right!=null||idx.right==null) {
			 if(idx.right==null) {
				 idx.right = l;
				 pre.right=null;
				 break;
			 }
			 idx = idx.right;
			 pre= pre.right;
	}return idx;}}
