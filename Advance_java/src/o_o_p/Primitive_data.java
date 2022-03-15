package o_o_p;

public class Primitive_data {
//	primitive data type means size of are fixed
/*				object
 * ----------------------------------------------
 * |		|		| 		|		   |		|	  |
 * String SBuffer SBuilder Number Character Boolean  Void
 * 							|
 * 		---------------------------------------
 * 		Byte  Short Integer Long  Float Double	
 * 
 * ---------------primitive-------==--------------------
 * name 	size							   Default
 * byte  -  8 bit  - 128 to 127 2-pow 7          0 
 * short - 16 bit  - 32,768 to 32,767			 0
 * int   - 32 bit  -2-pow 31 to 2-pow31 - 1		 0 
 * float - 32 bit  -2-pow 32 to 2-pow31 - 1		 0.0f
 * long  - 64 bit  -2-pow 63 to 2-pow63 - 1		 0L
 * double- 64 bit  -2-pow 63 to 2-pow63 - 1		 0.0d
 * boolean - 1 bit not precisely defined		 false
 * char  - bit unicode character \u0000 to \uffff '\u0000'
 * 0 to 65535
 */
	public static void main(String[] args) {
		int n = 050;
		System.out.println(n);
		int m = 0xa;//10
		System.out.println(m);
		
		float f =  103032f;//no error 103020F
		float f1 =  103032;//no error
		System.out.println(f1);
		float f2 =  (float) 10303.2d;// defualt consider as double
		System.out.println(f2);
		
		
		double d1 = 10303.2f;
		double d2 = 10303.25D;
		double d3 = 10303.25d;
		double d4 = 045625.2;//octal
		//double d5 = 04589;//octal out of range
		
		double d6= 0XFACe;
		System.out.println(d6);
		
		
//		double dd = 0x10303.25d;
//		error float can hold hexa 
//		malformed floating point literal
		
//		float d4 = d1;
		//posible loss of precision found double required int 
		///
		char ch1 ='\n';
		char ch2 ='\u0999';
		System.out.println(ch2);
		
	}
}



