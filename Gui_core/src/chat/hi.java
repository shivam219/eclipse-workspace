package chat;

public class hi {
	public static void main(String[] args) {
		String name = "dee : exit";
//					   0123456789		
		int l= name.indexOf(':')+2;
		String exit = name.substring(l, l+4);
		System.out.println(exit.equals("exit"));
	}
}
