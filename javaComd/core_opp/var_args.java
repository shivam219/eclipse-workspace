
public class var_args {	public var_args() {}	
	String str ; float f ; double b;
	public static void main(String[] args) {
		String str2 ;
		var_args ob = new var_args();
		System.out.println(ob.str);
		System.out.println(ob.f);
		System.out.println(ob.b);
		try {
			System.out.println(str2);			
		} catch (Error e) {
			// TODO: handle exception
		}
		
	}
	
}
