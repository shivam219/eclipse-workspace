package Generic;

public class Main2<T,V> {
	T ob;
	V ob2;
	
	Main2(T ob,V ob2){
		this.ob =ob;
		this.ob2 =ob2;
	}
	void show() {
		System.out.println(ob.getClass().getName());
		System.out.println(ob2.getClass().getName());
	}
	void display() {
		System.out.println(ob+"\n"+ob2);
	}
	
	
}
