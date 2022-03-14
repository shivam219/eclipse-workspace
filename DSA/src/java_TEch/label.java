package java_TEch;

public class label {
	public static void main(String[] args) {
		int a=5; 
		int b =16;
		
		first :{
			second:{
				third:{
					if(a==b>>1) {
						break second;
					}
					System.out.println('s');
				}
				System.out.println(a);				
			}
			System.out.println(b);
		}
		
		System.out.println(a==b>>1);
		
		String s = new String("Hellow");
		s.replace("e", "x");
		System.out.println(s);
		System.out.println(b>>1);
		char c [] = {'a','b','c'};
		System.out.println(new String(c));
		
//		int as[] = {65 ,67};
//		String s2 = new String(as,65,67);
//		System.out.println(as);
//		
		System.out.println();
	}
}
  