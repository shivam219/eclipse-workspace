package hackerrank;

class A {
	
}
class OvD_OvL {
	private void m1(int n) {
		System.out.println("M1");
	}

	private void m1(String m) {
		System.out.println("M2");
	}

// same and same different para -- overloading 
// same and same   para --         overriding
	public static void main(String[] args) {
		OvD_OvL obj = new OvD_OvL();
		obj.m1(1);
		obj.m1(null);
	}
}