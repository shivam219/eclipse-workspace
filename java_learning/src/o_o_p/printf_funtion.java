package o_o_p;

public class printf_funtion {
	public static void main(String[] args) {
//		System.out.printf("This %d is a %dformat",123 , 12);
		boolean a = true ;
//		System.out.printf("%b", a);
		// %b ==boolean
		// %d %f== decimal, float
		// %c %s== char, String 
		String s = "Rama Karma";
		System.out.printf("Hello is %10s hii ",s );// pre space with adding String
		System.out.println();
		System.out.printf("Hello is %-10s hii ",s );// post space
		System.out.println();
		
		float f = 20000.1223f;
		System.out.printf("%.1f",f);System.out.println();
		System.out.printf("%+020f",f); // if + is given value or add to format evaluated -- +100
		System.out.printf("%,f",f);
				
	}
}
