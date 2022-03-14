package genrics;

import java.util.ArrayList;

class Container<T extends Number> {
	T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public void show() {
		System.out.println(value.getClass().getName());
	}
	

}

public class List_generics {
	public static void main(String[] args) {
//		Container<?> obj = new Container();
		Container<Integer> obj = new Container<Integer>();
		ArrayList mylist = new ArrayList<Integer>();
		obj.value = 3;
		Object o = obj.getValue();
		System.out.println(o);
		obj.show();
	}
}
