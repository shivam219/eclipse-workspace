package Test;

public class Tenary_o {
	public static void main(String[] args) {
		int x = (10 > 20) ? 30 : ((40 > 50) ? 50 : 70);

		System.out.println(x);

//		 new operator 
		Tenary_o ob = new Tenary_o();

//		 [] square operator  
//		int [] x= new int [10];

//		operator precedence 
//		 1)uninary OP 
//			[] , x++,x--,==same
//			++x,--x ,~, ! ==same
//			new ,<type> == same
//		 2)binary OP
//	  	 3)ternary OP

//		high prority === unar> binary> ternary
//		assingment OP

	}
}
