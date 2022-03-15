package Generic;

import java.util.ArrayList;

public class Genric2 {
	// bounded type == you can create the object of a generics class to have
	// data of specific derived type ex . number
	public static void main(String[] args) {
		Genric2_all_type<Integer, Integer> myint = new Genric2_all_type<>(1, 2);
		Genric2_all_type<Double,Double> mydouble = new Genric2_all_type<>(2.3,2.1);
		Genric2_all_type<Character,String > mychar = new Genric2_all_type<>('c', "rama");
		Genric2_all_type<String,Integer > mystring = new Genric2_all_type<>("Hello",2);

		System.out.println(myint.getvalue());
		System.out.println(mydouble.getvalue());
		System.out.println(mychar.getvalue());
		System.out.println(mystring.getvalue());
	}
}
