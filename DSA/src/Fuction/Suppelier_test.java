package Fuction;

import java.time.LocalDateTime;
import java.util.function.Supplier;
import   java.lang.Math;
//4)supplier - give an output only
public class Suppelier_test {
	public static void main(String[] args) {
		
	Supplier<Double> getRan = () -> Math.random();
	System.out.println(getRan.get());
	Supplier<String> ran =()->{
		String str="";
		for(int i = 0 ; i<6;i++) {
			
			
		}
		return str;
	};
	

	}
}
class SupplierTest implements Supplier<LocalDateTime>{

	@Override
	public LocalDateTime get() {
		return LocalDateTime.now();
	}
	public static void main(String[] args) {
		Supplier<LocalDateTime> supplier = new SupplierTest();
		System.out.println(supplier.get());
		Supplier<LocalDateTime> sup = new Supplier<LocalDateTime>() {
			@Override
			public LocalDateTime get() {
				return LocalDateTime.now();
			}
			
		};
		System.out.println(sup.get());
		
		Supplier<LocalDateTime> s  = ()->LocalDateTime.now();
		System.out.println(s.get());
	}
	
}