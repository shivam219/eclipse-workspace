package string;

public class String_funciont {
	public static void main(String[] args) {
		
		String msg = "deepak : aaaaaaaaazzzzzzzz";
		
		String exit = msg.substring(msg.indexOf(':')+2, (msg.indexOf('t')==-1? msg.indexOf(':')+2:msg.indexOf('t')+1));
//		System.out.println("deepak : exit".indexOf('z'));//-
		System.out.println(exit);
		
		String s = " बाराखड़ी";
		System.out.println(s);
	}
}
