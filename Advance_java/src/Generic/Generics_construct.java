package Generic;

public class Generics_construct<T> {
	public Generics_construct(T[] array) {
		for (T x : array) {
			System.out.print(x);
		}
		System.out.println();
	}

	public Generics_construct() {
	}

	public static void main(String[] args) {
		gen_call on = new gen_call();
		on.main(null);
	}
}

class gen_call {
	public static void main(String[] args) {
		Integer[] arr = { 4, 1, 3, 2 };
		Generics_construct<Integer> ob = new Generics_construct<Integer>(arr);
	}
}
