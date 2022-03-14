package string;



public class Str_buil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String buffer is synchronize ===String builder non synchronise
		 * mean single thread can access this string
		 * StringBuilder (1.5V)
		 * 
		 * Getting object one by one at fixed.
		 * 
		 * String Buffer is synchronize or String Builder is non-synchronize.
		 */

// 		Is faster then string buffer.
		StringBuilder ss= new StringBuilder("Shivam");
		ss.append("choudhary");
		System.out.println(ss);
		System.out.println(ss.getClass());
		System.out.println(ss.hashCode());
		System.out.println(ss.subSequence(2, 5));
	/*	Ensure capacity :-
	 * 
	 * 
		minimum value should satisfy. 
		capacity :- 
		it just print total capacity of object.
	*/
		StringBuffer sb = new StringBuffer();
		sb.ensureCapacity(10);
		sb.append("abdcefghijklom");
		System.out.println(sb);
//		Ensure capacity is we should minimum capacity.
		
		StringBuffer ssb = new StringBuffer();
		ssb.ensureCapacity(10);
		ssb.append("abdom");
		System.out.println(ssb);
		
	}

}
