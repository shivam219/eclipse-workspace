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
