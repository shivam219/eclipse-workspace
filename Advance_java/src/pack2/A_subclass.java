package pack2;

import pack1.*;
// access modifier 
/*Modifier    class	 package	subclass       world
 * public 		Y 		Y			Y			 Y
 * protect 		Y		Y			Y		 	 N
 * default		Y		Y			N			 N
 * private		Y		N			N			 N
 * 
 */
public class A_subclass extends A {
	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.defaultmessage);
	}
	
}


