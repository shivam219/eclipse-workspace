package linkedlistoo;

public class add_one_represent_linkedLIst {
	static link head; 
	public static void main(String[] args) {
		dol_sort_int ob = new dol_sort_int();
		link l = ob.createLink();
		String s= listToString(l);
		Integer  n = Integer.parseInt(s);
		Integer  mn = n+1;
		char [] ch= String.valueOf(mn).toCharArray();
			link l2 =printModified(ch,0,ch.length);
			System.out.println(ob.printLink(l2));
		}
	public static link printModified(char[] ch,int i, int j) {
		if(i==j)return null;
		Integer a = Integer.parseInt(String.valueOf(ch[i]));
		int data =  a;
		link li = new link(data);
		li.right = printModified(ch,i+1,j);
		return li;
		}
	public static String listToString(link l) {
		String sum ="";
		while(l!=null ||l==null) {
			if(l.right==null) {
				sum = sum+l.data;
				break;
			}
			sum= sum +l.data;
			l = l.right;
		}
		return sum;
	}}