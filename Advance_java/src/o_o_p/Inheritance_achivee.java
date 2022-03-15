package o_o_p;



class Parent {

}

//Interitacne is a parent 
// tilltiy couple ,means chanage may affect
class Inheritance_achive extends Parent {
	public static void main(String[] args) {

		Studentttt s = new Studentttt();
//		has - a using new , not tilly couple
		/*
		 * -->association a) Aggregation- weak bounding ex : car has-A music b)
		 * composition ex : car has-A engine
		 * 
		 */

	}
}

class Studentttt {

}

class BBBB {

	void m1(short i) {
		System.out.println(i + " byte  ");
	}

//	void m1(int i ){
//		System.out.println(i + " primit ");
//	}
	void m1(float i) {
		System.out.println(i + " Float ");
	}

	void m1(double i) {
		System.out.println(i + " primit ");
	}

	void m1(Object i) {
		System.out.println(i + " Obejct ");
	}

	void m1(String i) {
		System.out.println(i + "String ");
	}

	void m1(StringBuffer i) {
		System.out.println(i + "  String  Buffere ");
	}

	void m1(StringBuilder i) {
		System.out.println(i + "  String Builder");
	}

	public static void main(String[] args) {
		BBBB ob = new BBBB();
//		ob.m1(null);
		ob.m1(20);
		ob.m1(20.52f);
		ob.m1(20.949446f);
	}
}

class aaA {
}

class ccC extends aaA {
}

class BBC {
	void m1(aaA ob) {
		System.out.println("animal ");
	}

	void m2(ccC ob) {
		System.out.println("child");
	}

	public static void main(String[] args) {
		aaA obaa = new aaA();
		ccC obcc = new ccC();
		aaA aabb = new ccC();// call base refernce types
		// method reesolution base on efernce types

	}
}

class x {

	int i = 10;
}

class y extends x {
	int i = 12;
}
