//		Integer b[] = {10,20,30}, c;	c=10;
package Generic;

public class Genrics_class {
	public static void main(String[] args) {

		Integer[] intarray = { 1, 2, 4 };
		Double[] doublearray = { 1.2, 4.3 };
		Character[] chararray = { 'a', 'b', 'c' };
		String[] stringarray = { "B", "Y", "C" };
//		Genrics_class.displayArray(intarray);
//		Genrics_class.displayArray(doublearray);
//		Genrics_class.displayArray(chararray);
//		Genrics_class.displayArray(stringarray);
		// one verison of accept all data type
		System.out.println(getfirst(intarray));
//		System.out.println();
//		System.out.println();
//		System.out.println();
	}

	public static <Thing> void displayArray(Thing[] array) {
		for (Thing x : array) {
			System.out.print(x);
		}
		System.out.println();
	}

	public static <T> T getfirst(T[] array) {

		return array[0];

	}
}
//		genClass<Integer>[] o2 = new genClass[2];

class genClass<T> {
	T t1;
	public void setT1(T t1) {
		this.t1 = t1;
	}
	public T getT1() {
		return t1;
	}
}
class Mainn {
	public static void main(String[] args) {
		genClass<Integer> ob1 = new genClass<Integer>();
		ob1.setT1(10);
		System.out.println(ob1.getT1());
		genClass<String> ob2 = new genClass<String>();
		ob2.setT1("hello");
		System.out.println(ob2.getT1());	
	}
}


