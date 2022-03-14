package java_TEch;

public class atoi {
	public static void main(String[] args) {
		long l = Integer.MAX_VALUE + 1;
		if (l > Integer.MAX_VALUE) {
//			return Integer.MAX_VALUE;
		}
		if (l < Integer.MIN_VALUE) {
//			return Integer.MAX_VALUE;			
		}
		int ll = -10;
		int m = -9;
		if (ll < m)
			System.out.println("s");
		String s = " ";
		if (s.charAt(0) == 32)
			System.out.println("is");
		System.out.println(rem("   0006526526 "));
		atoia("  255 5566  45 ");
		

	}

	public static int atoia(final String A) {
		String res = rem(A);
		String[] arr = res.split("\\s");
		for (int i = 0; i < arr.length; i++) {
			
		}
		return 0;
	}

	public static String rem(String A) {
		String res = "";
		for (int i = 0; i < A.length(); i++) {
			if(!(A.charAt(i)=='0'|| A.charAt(i)==32)) {
				res = A.substring(i,A.length());
			}
		}
		return res;
	}
}
class String_remove_whiteApace{
	public static int atoi(final String A) {
       	String res = "";
		for (int i = 0; i < A.length(); i++) {
			
			if(!(A.charAt(i)=='0'|| A.charAt(i)==32)) {
				res = A.substring(i,A.length()); break;
			}
		}
	    String arr[]= A.split("\\D");
		for(int i = 0; i<arr.length;i++) {
			if(arr[i].matches("\\d+")) {
                try {
				int n = Integer.parseInt(arr[i]);
                return n;}
                catch(NumberFormatException e ){
                   if(arr[i].charAt(i)=='-') {
                	   return Integer.MAX_VALUE;
                   }
                   else {
                   return Integer.MIN_VALUE;}
                }
			}
		}
        return 0;
	}
	public static void main(String[] args) {
			System.out.println(
			atoi("-54332872018247709407 4 54"));
	}
}
