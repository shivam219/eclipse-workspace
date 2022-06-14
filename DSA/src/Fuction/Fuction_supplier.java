package Fuction;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class Fuction_supplier {
	public static <T> void main(String[] args) {
		Predicate<String> check = new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
			
				return false;
			}
		};
//		Predicate<String> check = 
			
		
		
		
		
		Supplier<Double> supDo1 = new Supplier<Double>() {
			public Double get() {
				return Math.random();
			}
		};
		//only supply data 
		Supplier<Double> supDo2 = ()->Math.random();
		System.out.println(supDo2);
		
		System.out.println(supDo2.get());
		
	}	
	
}
interface  sup {
//	T add(T t1 ,T t2); 
	<R> int addInt(R t1 ,R t2); 
	
	<R> R addTwo(R t1 ,R t2); 
	
}