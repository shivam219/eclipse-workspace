package o_o_p;

public class Con_ext {
	String name;
	int age;
	double weight;
	Object return1;

	public Con_ext(String name, int age, int weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public Con_ext(int... i) {
		for (int k : i) {
			System.out.println(k);
		}
	}

	void eat() {
		System.out.println(this.name + " is eating ");
	}

	void drink() {
		System.out.println(this.name + " is drink ");
	}
	// this allow to do different object
}
