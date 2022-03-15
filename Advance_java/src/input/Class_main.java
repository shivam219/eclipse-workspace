package input;

class printer {
	static public void show(Number i) {
		System.out.println(i);

	}

	public void show() {
		System.out.println("parent");

	}

}

public class Class_main  {
	public static void main(String[] args) {
		printer ob2 = new printer() {
			//override and overload but not 
			public void show(double i) {
				System.out.println(i);
			}
			public void hi() {
				System.out.println("ho");
			}
			public void name() {
				System.out.println("name");
			}
		};
		ob2.show(4);
//		ob2.name();
	}
}