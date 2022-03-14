package staticc;

public class st_me {

	static int aa=10;
	 final static int bb = 20;
	public static void main(String[] args) {
		int a = st_me.aa;
		//int b = st_me.bb;
		st_me.aa =20;
		
		System.out.println(st_me.aa);
		System.out.println(a);
		
	}
}
