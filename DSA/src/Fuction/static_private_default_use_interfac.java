package Fuction;

public class static_private_default_use_interfac {
	public static void main(String[] args) {

	}
}

//@FunctionalInterface
interface stati_inte {
	public static void stati_method() {
		System.out.println("Interface static method called");
	}

	default void defualt_method() {
		System.out.println("Interface method called");
	}

	static void private_method() {
		System.out.println("Inteface private method ");
	}
	<R> R add();
	public static <R> void main(String[] args) {
		stati_inte ob = new stati_inte() {
			public <R> R add() {
				return (R) new Character('s');
//				return (R) "ss";
			}
		};
		ob.defualt_method();
	}
}
