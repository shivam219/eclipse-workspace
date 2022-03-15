package Generic;

public class Main {
	public static void main(String[] args) {
//		int is primitve and double also but Double is class 
//		Main2<Integer,Double> obj1 = new Main2<>(10,10.2);
//		obj1.show();
//		obj1.display();

//		Sum
//		Sum<Integer> obj = new Sum<>(10);
//		System.out.println(obj.square());

//		Equals 
		Equals<Integer> oo = new Equals<>(10);
		Equals<Double> o = new Equals<>(10.0);
		oo.absEquals(o);

	}
}
