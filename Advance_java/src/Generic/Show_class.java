package Generic;

import java.util.ArrayList;

public class Show_class {
	static public void Show_class() {
//		return 5;
		System.out.println("hiii");
	}

	public Show_class() {
		System.out.println("rama");
	}

	public void show(String mgs) {
		System.out.println();
	}

	public static void main(String[] args) {
		new Show_class();
		Show_class.Show_class();
	}
}

class show_msg<T> {
	public void show(T ob) {
		System.out.println(ob);
	}

	public static void main(String[] args) {
		show_msg<Integer> ob = new show_msg<Integer>();
		show_msg<String> obs = new show_msg<String>();
		obs.show("rama");
		stu student = new stu();
		show_msg<stu> s1 = new  show_msg<stu>();
		s1.show(student);
		ArrayList al = new ArrayList();
	
	}
}

class stu {
	String name = "shvia";

	@Override
	public String toString() {
		return name;
	}
}

class customer {
	String name = "kisrnam";
	int id = 200;
	String loctaion = "mumbai";

	@Override
	public String toString() {
		return name + id + loctaion;
	}
}
