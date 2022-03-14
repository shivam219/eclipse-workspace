package hackerrank;

public class Varage_ {

	public static void main(String[] args) {
		Add obj = new Add();
//		obj.add(null);
		int a = obj.add(1, 2, 3);
		System.out.println(a);
	}
}

class Add {
	public int add(int... n) {
		int t = 0;
		String s = "";
		for (int i : n) {
			t += i;
			System.out.print(s + i);
			s = "+";
		}
		System.out.println("=" + t);
		return t;

	}
}