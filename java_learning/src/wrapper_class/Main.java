package wrapper_class;

import java.util.ArrayList;

public class Main {
	/*
	 * wrapper class =>provide a way to use primitive data type as reference data
	 * types =>data types contain useful methods can be used with collections
	 *
	 * primitive wrapper ----------|----------| boolean |Boolean char |Character int
	 * |Integer double |Double
	 *
	 * Autoboxin -- the automatice conversion that the java complier make between
	 * the primitve correcponding wrapper classes unboxing --- the reverse of
	 * autoboxing automatice conversion wrapper class to primitve
	 * 
	 */
	public static void main(String[] args) {
		Boolean a = true;
		Character b = 's';
		Integer c = 123;
		Double d = 3.14;
		String e = "agb";// is refference datatype have useful method
		ArrayList<String> ar = new ArrayList<>();
		ArrayList<String> ar3 = new ArrayList<>();
		ar3.add("Puri");
		ar3.add("Samsa");
		ar3.add("char sabji");
		ArrayList<String> ar2 = new ArrayList<>();
		ar2.add("pizaa");
		ar2.add("hotdog");
		ar2.add("jalebi");

		ar.addAll(ar2);
		ar.addAll(ar3);
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
	}
}
