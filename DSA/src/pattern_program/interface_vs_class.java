package pattern_program;

public class interface_vs_class<T> {

	public static <T  extends Number> void main(String[] args) {

		a<Integer> OB = (a, b) -> {
		 return a + "  " + b;
		};

		System.out.println(OB.mi(20, 10));
		call<Integer> ob = new call();
		ob.show(10);
		call ob1 = new call();
		ob1.show(10);
		
	}
}

interface a<T> {
	String mi(T a, T b);
}

class call<T>{
	public <E> void show(T t) {
		System.out.println(t);
	}
}

class me{
	public <R> void m1(R r1) {
		
	}
	
}