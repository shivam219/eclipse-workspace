package o_o_p;

class p1 {
	public void property() {
		System.out.println("Gold  Bank Silver");
	}

	public void marry() {
		System.out.println("LAKMI");
	}
}

class c1 extends p1 {
	public void property() {
		System.out.println("coper");
	}

//	public void marry() {
//		System.out.println("Na");
//	}
}

public class OverRiddie_2 {
	public static void main(String[] args) {
		p1 ob = new c1();
		ob.marry();
		Object ob1 = new String("shiva");
	}
}
