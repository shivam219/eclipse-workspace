package string;

public class Sting_class {
	public static void main(String[] args) {
//	default capacity (size) 16 not byte 
//	String s=" shivm";
//	String ss=s.concat("choudhary");
//	
//	System.out.println(ss);
//	
//	String s1= new String ();
//	StringBuffer sb = new StringBuffer();
//	sb.append("aaaaaaaaaaaaaaaaa");
//	 if any element is added extra the is will going 
//	 double that object
//	System.out.println(sb);
//	System.out.println(sb.capacity());
//		StringBuffer s = new StringBuffer("a");
//
//		System.out.println(s.capacity());
		/*
		 * StringBuffer ss = new StringBuffer(); // 16 + 20=16 but append 16+1*2=34
		 * ss.append("aaaaaaaaaaaaaaaaaaaa"); //16+ 4 = 20 -32 =12 // 17 + 1 *2=36
		 * System.out.println(ss.capacity()); ss.append("aaaaaaaaaaaaaaa");
		 * System.out.println(ss.capacity());
		 */

//		StringBuffer  s = new StringBuffer("aaaa"); //16+1 ==17+1*2==36  ==20
//					  s.append("aaaaaaaaaaaaaaaaa");			
//		System.out.println(s.capacity());
		StringBuffer ss = new StringBuffer("sayhog");
//		 ss.setCharAt(3,'c');
//		 System.out.print(ss);
//		 ss.deleteCharAt(3);
//		 ss.delete(2, 5);
//		 ss.insert(5,"colloege");
//		 

//		System.out.println(ss.reverse());
//		ss.setLength(4);
//		System.out.println(ss);
		ss.ensureCapacity(18);
		ss.append("shivam chouhdaru kumat amtadjakdgkkhjskahjkh");
		System.out.println(ss);
		System.out.println(ss.capacity());

	}
}