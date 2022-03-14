package abstra_calss;
interface Demo{
	default void m2() {
	
	}
	//	
	 void m3();
	// automatic convert abstract
}

public class Interface_class implements Demo{
	public void m3() { // public compulsory to interface method
		
		System.out.println("hii");
	}
	public static void main(String[] args) {
// interface is pure abstract class.
	
	}


}
