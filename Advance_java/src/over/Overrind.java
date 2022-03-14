package over;
class Super {
 	
	public void hii() {
		
		System.out.println("Your in super");
	}
	
}
class sub extends Super {
	
 	public void hii() {
	
	
		System.out.println(" Your in sub ");
	}
 	
	
}
public class Overrind {
	public static void main(String[] args) {
//		sub  ob1 = new sub();
//		ob1.hii();
		Super ss = new sub();
		ss.hii();
	}
	
	
}
