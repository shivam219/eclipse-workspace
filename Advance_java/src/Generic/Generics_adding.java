package Generic;

public class Generics_adding<T1 extends Number, T2> {

	public Generics_adding(T1 t1, T2 t2) {
		System.out.println(t1.equals(t2));
	}

	public double add(T1 one, T1 two) {

		System.out.println(one.doubleValue() + two.doubleValue());
		return 0;
	}

	public static void main(String[] args) {
		run_add o = new run_add();
		o.main(null);
	}
}

class run_add<R> {
	public static void main(String[] args) {
//		int a = 10, b = 20;
//		String aa = "rama", bb = "rama";
//		Generics_adding<Integer, Integer> o = new Generics_adding<Integer, Integer>(a, b);
//		o.add(a, b);
//		Generics_adding<String, String> oo = new Generics_adding<String, String>(aa, bb);
		a(10.52);
//		a(1.5);
//		a("ss");
//		a('s');
//		Object ob = new String("kumar");
//		a(ob);
	}

	public static <R> R a(R r) {
//		System.out.println(r.toString() );
		System.out.println(r.getClass().getName());
		return r;
	}
}

class genINt<T> {
	T t;
	@SuppressWarnings("unchecked")
//	cannot cast primitive data to generic directly

	public static <TT> void main(String[] args) {
		TT t1 = (TT) "Hello";
		TT t2 = (TT) Integer.valueOf(10);
		System.out.println(t1);
		System.out.println(t2);
	}
}
