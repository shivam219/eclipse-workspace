package tree;

public class diameterOf_tree {
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.left.left = new Node(1);
		root.left.right = new Node(5);
		root.left.right.left = new Node(5);
		root.right = new Node(2);
		root.right.right= new Node(2);//--ri
		root.right.left.left = new Node(2);

	}
	int height(Node root) {
		if (root == null)
			return 0;
		else {
			int Lhit = height(root.left);
			int Rhit = height(root.right);
			if (Lhit > Rhit)
				return (Lhit + 1);
			else
				return (Rhit + 1);
		}
	}
	int diameter(Node root1) {
		if(root1!=null && root1.left==null && root1.right==null)return 1;
		Node root = root1;
		int h = height(root); int h1=0,h2=0;
		int lmax = 0, rmax =0;
		for(int i = 0; i<(h/2);i++) {
        if(root!=null){
             h1 = heightEach(root,0,0);
            root=root.left;
        if(h1>lmax)
        	lmax = h1;
        }}
        root = root1.right;
		for(int i = 0; i<(h/2)-1;i++) {
		    if(root!=null){
			h2 = heightEach(root,0,0);
			root = root.right;
			if(h2>rmax)
				rmax = h2;
		}}
        return Math.max(lmax, rmax);
    }
	
	int heightEach(Node root, int i , int j) {
		if(root==null)return 0;
		else {
			int Lhit =heightEach(root.left,i+1,j+1);//left
			int Rhit =heightEach(root.right,i+1,j+1);//right
			if(i==0 && j==0) {
				return Lhit + Rhit +1; //return when both come at same level return by 1 + value;
			}
			if(Lhit>Rhit) 
				return (Lhit+1);
			else 
				return (Rhit+1);
		}
		
	}
}
