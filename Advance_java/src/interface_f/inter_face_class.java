package interface_f;

// interface can contain variable
// every variable are by 
//default public
// static
// final 
// why public -- make visible for the other class
// why static -- without exiting object implementing class can acces this variable
// why final -- one implemented clas change values then remaining class
// will be affected . so to restrict we are using final keywords
interface inter2 {
	int u = 20;

	void m1();
}

interface inter {

	int u = 10;

	void m1();

	default void m3() {

	}
}

//class demo implements inter {
//
//	public void m1() {
//		System.out.println("hiii");
//	}
//
//}

// mutliple interface we can implements
// use extends before implements
public class inter_face_class implements inter, inter2 {
	public static void main(String[] args) {
		inter_face_class on = new inter_face_class();
		System.out.println(inter.u);
//		System.out.println(on.u);//embious 
		 
		on.m1();
	}

	// implementation outside of class
	public void m1() {
		System.out.println("hiiii");
	}
}
