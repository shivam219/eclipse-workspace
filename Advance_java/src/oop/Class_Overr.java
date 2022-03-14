package oop;

//class GGparent {
//	
//// data hiding adding private in overriding
//	float add(float a, float b) {
//		System.out.println("Float");
//		return a + b;
//	}
//}
//
//class PParent extends GGparent {
//	Integer add(int a, int b) {
//		System.out.println("Int");
//		return a + b;
//	}
//}
class GGparent {

// data hiding adding private in overriding
	public   int add(int a, int b) {
		System.out.println("GGParent");
		return a + b;
	}
}

class PParent extends GGparent {
	public  final  int add(int a, int b) {
		System.out.println("Parent");
		return a * b;
	}
}

// final modifier can apply by method , class variable
// can we change return 1.4 not allowed and 1.5 it allowed 
public class Class_Overr {
	
	public static void main(String[] args) {
		GGparent ob = new PParent();
		ob.add(50, 52);
	}
}
