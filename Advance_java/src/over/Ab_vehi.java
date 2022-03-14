package over;

abstract public class Ab_vehi {
	abstract void tyer();

}

class bike extends Ab_vehi {

	void tyer() {
		System.out.println(" bike use tvs tyer");

	}

	public static void main(String[] args) {
		System.out.println("Programme Start");
         bike bi =new bike ();
         bi.tyer();

	}

}