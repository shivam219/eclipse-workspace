package string;

public class String_name {
	public static void main(String[] args) {
		StringBuffer a = new StringBuffer("java"); // 16 + 4 = 20
		StringBuffer b = new StringBuffer();// 16

		System.out.println(a.capacity());// 20
		a.append("123456789,123456789");  //16+1=17*3=42
		System.out.println(a.capacity() + "  " + a.length());// 20
		b.append("123456789,123456789,123456789,123456");// default 16+1 = 17 * 2 = 34
		System.out.println(b.capacity() + "  " + b.length());
	}
}
