package oop;

public class STringclas {
	public static void main(String[] args) {
		String ss = new String("abc    a ");
//		System.out.println(ss.toUpperCase());
//		System.out.println(ss.toLowerCase());
//		System.out.println(ss.trim());
//		System.out.println(ss.lastIndexOf('a'));
//		System.out.println(ss.replace('a','z'));
//		
		String s2=ss.toUpperCase();
		String s3=ss.toLowerCase();
		System.out.println(ss==s2);
		System.out.println(ss==s3);
		String v1 = "ABCDEF";
		String v2 = v1.toString();
		System.out.println(v1.toString());
		System.out.println(v1==v2);
		
		String v3 =v1.toLowerCase();
		String v4=v1.toUpperCase();
		System.out.println(v1==v3);
		System.out.println(v1==v4);
		
		
		
		
		
		
	}
}
