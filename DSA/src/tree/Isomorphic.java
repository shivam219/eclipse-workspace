package tree;

public class Isomorphic {
	public static void main(String[] args) {
		
	}
	 
	boolean iso(Node p1 , Node p2){
		if(p1==null && p1==null)return true;
		if(p1.data!=p2.data)return false;
		if(p1==null || p2==null) return false;
		if(iso(p1.left, p2.left)&&iso(p1.right, p2.right) || iso(p1.right, p2.left) && iso(p1.left, p2.right))
				return true;
		return false;
		
		
	}
}	
