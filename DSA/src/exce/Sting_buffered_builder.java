package exce;

public class Sting_buffered_builder {
	public static void main(String[] args) {
		String ss = new String("Shivam");
		String s1 = "Shivam";
		StringBuffer sbf = new  StringBuffer("Shivam");
		StringBuilder sbl = new StringBuilder("Shivam");
		 
		System.out.println(ss.equals(s1));
		System.out.println(ss.equals(sbf));
		System.out.println(sbf.equals(sbl));
		System.out.println(ss.equals(sbl));
		
	}
}
