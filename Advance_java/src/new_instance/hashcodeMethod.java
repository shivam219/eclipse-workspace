package new_instance;

public class hashcodeMethod {
	public static void main(String[] args) {
		stu ob1 = new stu("shviam");
		stu ob2 = new stu("shviam");
		stu ob3 = new stu("shviam");
		System.out.println(ob1.equals(ob3));
		System.out.println(ob1.hashCode());
		System.out.println(ob2.hashCode());

		String na = "shivam";
		String name = "shivam";
		System.out.println("-------------");
		System.out.println(na.hashCode());
		System.out.println(name.hashCode());

	}
}

class stu {
	String name;

	public stu(String name) {
		this.name = name;
	}

	public boolean equals(Object obj) {
		return this.name == ((stu) obj).name;
	}

	public int hashCode() {
		return this.name.hashCode();
	}

}