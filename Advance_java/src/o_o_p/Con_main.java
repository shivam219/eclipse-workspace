package o_o_p;

//import java.lang.reflect.Array;
import java.util.Arrays;

public class Con_main {
	public static void main(String[] args) {
		Con_ext ob = new Con_ext("ram", 00, 100);
		Con_ext ob1 = new Con_ext("krisna", 00, 100);
//		System.out.print(ob.age + ob.name + ob.weight);
		ob.eat();
		ob1.eat();
		int a[] = { 33, 3, 4, 5 };
		float  b[] = { 33, 3, 4, 5 };
		
		Con_ext ob2 = new Con_ext(a);
		Con_ext ob3 = new Con_ext(a);
	}

}
