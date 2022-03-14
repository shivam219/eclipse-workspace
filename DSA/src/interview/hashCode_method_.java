package interview;

public class hashCode_method_ {
	public static void main(String[] args) {

		Student s1 = new Student(10);
		Student s2 = new Student(10);
		System.out.println(s1.equals(s1));

		Student s3 = null;
		Student s4 = null;
		System.out.println(s3.equals(s4));
	}
}

class Student {
	int id = 0;

	Student(int id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj instanceof Student) {
			Student t = (Student) obj;
			t.id = this.id;
		}
		return false;
	}
}





















class ma {

	static protected void m1() {
		System.out.println("I am static method");
	}
}

class mo extends ma{
	static public  void m1() {
		System.out.println("I am static method");
	}
	public static void main(String[] args) {

	}
}







