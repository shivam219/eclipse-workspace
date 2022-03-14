package o_o_p;

public class Inner_class {
	public static void main(String[] args) {

	}

	class in {
		void h() {
			System.out.println("Class insinde -class");
			class i {

				public void show() {
					System.out.println("this");
				}
			}
			i o = new i();
			o.show();
		}

	}

	interface a {
		/// public static final--- field
		// public static---- method with are overriden
		public void show(int a, int v, int b, int... is);

		public void m2();

		private void m3() {
		}

		default void m1() {

		}

	}
}