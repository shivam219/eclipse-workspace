package java_TEch;

public class charactero_class {
	public static void main(String[] args) {
		char a [] = {'a', ' ' ,'c','a'};
		for(int i = 0; i<a.length;i++) {
//			System.out.println(Character.isValidCodePoint(5));//valid till 2byte 
		//	System.out.println(Character.MAX_CODE_POINT);//1114111
//			System.out.println(Character.SIZE);// 16 bit
			System.out.println(Character.charCount(422));
			
			int l ='a';
			System.out.println(i);
			short s = 'र';
			System.out.println(s);
			byte b = 'a';
			System.out.println(b);
			
			char c = 'र';
			System.out.println( (int)c);
			return ;
		}
	}
}
