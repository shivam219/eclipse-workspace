package Fuction;

import java.util.function.Predicate;

//this functional interface present in java.uitl.fuction Interface v-1.8 
//--predicate boolean result
//--consumer -no result
//function -input and output
//supplier no input only supply
/*why to write @functionalInterface 
to tell complier that is fuctional interface only contain one abstract method if two crete by use then throw errors
*/
public class Fuciton_Predicate  {
	public static void main(String[] args) {
		Predicate<String> ckl = new Predicate<String>() {
			public boolean test(String t) {
				return t.length()>5;
			}
		}; 
		System.out.println(ckl.test("ss"));
		Predicate<String> chl2 = str-> str.length()>5;
		System.out.println(chl2.test("ss"));
	/* cannot convert a() to int
		int b =  new a() {
			@Override
			public int show() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		*/
		a add = new a() { 
		public int addOne(int i) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		///        can use int i because only readiy delcase 
		a addLamda1 = i-> i+1;
		a addLamda2 = i-> { System.out.println("ss");return i+1;};
		System.out.println(addLamda2.addOne(50));
		//we cannot declare type then addOne select as object
//		aa addany = new  aa() {
//			public int addOne(Object t) {
//				return 0;
//			}
//		
	}
}

@FunctionalInterface //checking one abstract should present
interface a {
	public abstract int addOne(int i) ;
}
@FunctionalInterface //checking one abstract should present
interface aa<T> {
	public abstract int addOne(T t) ;
}
