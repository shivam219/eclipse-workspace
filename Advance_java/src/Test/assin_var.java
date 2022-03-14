package Test;

public class assin_var {
	public static void main(String[] args) {
//		>>> right
//      1 1 0 1 0 1
//		0 0 1 1 0 1
//		>>> invailid

//		byte b = 10;
//		b+=10;// it's also typecaste internally
//		b=b++;
//		System.out.println(b);
//		output:- post incre=
//				10
//		b=++b; // it's internal tycasting
//		System.out.println(b);
//		output:- post incre=
//			11

//		System.out.println(b);
//		error integer cannot

//		byte bb=125;//126 to -127 out of range get -126
//		b+=5;
//		System.out.println(b);
//		output : -126

//		 assingment operator
//		int a,bbb,c,d;
//		a=bbb=c=d=20;
//		a+=bbb-=c*=d=20/2;	
//		

//		ternary opearto

//		(? : )
//		int x =(10<20) ? : 30 : 140;
//		System.out.println(x);
//		int a=10,b=20;
//		String ans= a > b ? "a is greater" : "b is greater";
//		System.out.println(ans);
		int a = 10;
		int b = 20;
		int c = 30;
//								   if 2                         else 2        if 3 							else 3        
		String result = a > b ?  a > c ? "a is greatest" : "c is greatest" : b > c ? "b is greatest" : "c is greatest";
//		               if main()                                                                           
		       
		System.out.println(result);

	}
}
