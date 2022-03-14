package Fuction;

/*enum only in inside interface,  */
public class refering_second_method_to_function_integer {
	public void sum(int a, int b) {
		System.out.print(" sum  " + (a + b));
	}
	public static void main(String[] args) {
		interf i = new interf() {
			public void add(int a, int b) {

			}
		};
		refering_second_method_to_function_integer ob = new refering_second_method_to_function_integer();
		interf i2 = (a, b) -> {
		};
		/* method reference */
		interf i3 = ob::sum;

		interClass iclass = re::new;
		re s1 = iclass.get("siva");

		/* second way student class */
		interstu sd = (name, age) -> new stu(name, age);
		interstu sd2 = stu::new;
		System.out.println(sd2.get("s", 5));

	}
}

class stu {
	String name;
	int age;
	public stu(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name + " " + age;
	}
}
interface interstu {
	public stu get(String name, int age);
}
class re {
	public re(String s) {
		System.out.println("in re");
	}
}
interface interf {
	public void add(int a, int b);
}
interface interClass {
	public re get(String s);

}
