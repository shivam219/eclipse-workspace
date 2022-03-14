//	int a=10,b=20;

//	public Abc(int a, int b) {
//		System.out.println(a + b);
//	}
//	
//	public Abc() {
//		// TODO Auto-generated constructor stub
//		System.out.println("Empty Constructure");
//	}
package contructor;
public class Abc {
	int total = 0;
	Abc(int... a) {
		System.out.println("Number of arguments: " + a.length);
		// using for each loop to display contents of a
		for (int i : a) {
			total = total + i;
//			System.out.println(i + " ");
		}
		System.out.println(total);
	}
	public static void main(String[] args) {
		new Abc(10, 20, 30);
	}
}
