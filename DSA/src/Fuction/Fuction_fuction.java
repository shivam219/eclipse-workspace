package Fuction;

import java.util.function.Function;

public class Fuction_fuction {
	/// function both input and output
	public static void main(String[] args)	 {
		Function<Integer,String> getInt = t->t*10+"sd";
		Function<Integer,String> getInt2 =new Function<Integer,String>(){
			public String apply(Integer r) {
				return r*r + "add";
				
			}
		};//not called uto matically 
		System.out.println(getInt.apply(10));
		
	}
}
