package Generic;

public class p {
	public static void main(String[] args) {
		show<Integer ,Integer> ob = new show<Integer,Integer>();
//		ob.
	}
}

class show<T,R > {
	public  R ret(R t) {
		return t;

	}

	public void display(T t) {
		System.out.println(t);
	}
}